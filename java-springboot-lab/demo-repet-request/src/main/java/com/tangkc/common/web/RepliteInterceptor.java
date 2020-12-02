package com.tangkc.common.web;

import com.tangkc.common.annotation.NotRepeatSubmit;
import com.tangkc.common.cache.ICache;
import com.tangkc.common.util.ApiUtil;
import com.tangkc.common.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @author tangkc
 * @description
 * @date 2020/12/2 18:48
 */
@Component
public class RepliteInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private ICache iCache;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取方法上的注解
        NotRepeatSubmit notRepeatSubmit = ApiUtil.getNotRepeatSubmit(handler);
        if(notRepeatSubmit == null){
            return super.preHandle(request, response, handler);
        }

        // 过期时间
        long value = notRepeatSubmit.value();
        // 需要排除的字段
        String[] excludeFeilds = notRepeatSubmit.excludeFeilds();
        String sign = ApiUtil.concatSignString(request, Arrays.asList(excludeFeilds));
        String cacheKey = MD5Util.encode(sign);
        boolean flag = iCache.containsKey(cacheKey);
        if(flag==true){
            throw new RuntimeException("重复提交");
        }
        iCache.put(cacheKey,cacheKey,value);
        return super.preHandle(request, response, handler);
    }
}

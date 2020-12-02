package com.tangkc.common.util;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.tangkc.common.annotation.NotRepeatSubmit;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author tangkc
 * @description
 * @date 2020/12/2 18:56
 */
public class ApiUtil {

    /**
     * 按参数名升续拼接参数
     */
    public static String concatParamString(HttpServletRequest request, List<String> excludeFeilds) {
        Map<String, String> paramterMap = new HashMap<>();
        request.getParameterMap().forEach((key, value) -> paramterMap.put(key, value[0]));
        // 按照key升续排序，然后拼接参数
        Set<String> keySet = paramterMap.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (String k : keyArray) {
            // 或略掉的字段
            if (excludeFeilds.contains(k)) {
                continue;
            }
            if (paramterMap.get(k).trim().length() > 0) {
                // 参数值为空，则不参与签名
                sb.append(k).append("=").append(paramterMap.get(k).trim()).append("&");
            }
        }

        return sb.toString();
    }

    /**
     * 拼接 request 中的 body
     */
    public static String concatRequestBodyString(HttpServletRequest request, List<String> excludeFeilds){
        String jsonStr = ReadAsChars(request);
        if(!JSONUtil.isJson(jsonStr)){
            return "";
        }
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr);
        Set<String> keySet = jsonObject.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (String k : keyArray) {
            // 略掉的字段
            if(excludeFeilds.contains(k)){
                continue;
            }
            String value = jsonObject.get(k).toString().trim();
            if (value.length() > 0) {
                // 参数值为空，则不参与签名
                sb.append(k).append("=").append(value).append("&");
            }
        }
        return sb.toString();
    }

    /**
     * 拼接请求中的所有参数
     */
    public static String concatSignString(HttpServletRequest request, List<String> excludeFeilds){
        StringBuffer requestURL = request.getRequestURL();
        String params = concatParamString(request,excludeFeilds);
        // String body = concatRequestBodyString(request,excludeFeilds);
        String result = requestURL.append("&").append(params).toString();
        return result;
    }

    /**
     * 获取方法上的@NotRepeatSubmit注解
     * @param handler
     * @return
     */
    public static NotRepeatSubmit getNotRepeatSubmit(Object handler) {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            NotRepeatSubmit annotation = method.getAnnotation(NotRepeatSubmit.class);

            return annotation;
        }

        return null;
    }

    /**
     * 获取 request 中的 body
     */
    private static String ReadAsChars(HttpServletRequest request) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder("");
        try {
            br = ObjectUtil.cloneByStream(request.getReader());
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}

package com.tangkc.base.web.filter;

import cn.hutool.core.util.StrUtil;
import com.tangkc.base.web.context.AppContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author tangkc
 * @description 全局拦截器
 * @date 2020/11/15 14:43
 */
@Slf4j
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ContextFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        Enumeration<String> headerNames = request.getHeaderNames();
        String traceId = request.getHeader("Trace-Id");
        if (StrUtil.isNotBlank(traceId)) {
            AppContext.getContext().setTraceId(traceId);
            log.info(traceId);
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}

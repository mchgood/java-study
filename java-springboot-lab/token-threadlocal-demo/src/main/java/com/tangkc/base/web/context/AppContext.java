package com.tangkc.base.web.context;

/**
 * @author tangkc
 * @description 全局上下文
 * @date 2020/11/15 14:47
 */
public class AppContext {
    public static final String TRACE_ID_HEADER = "Trace-Id";
    private static final long serialVersionUID = -979220111440953115L;

    private String traceId;

    private static final ThreadLocal<AppContext> LOCAL = ThreadLocal.withInitial(AppContext::new);

    private AppContext(){

    }

    public static AppContext getContext() {
        return LOCAL.get();
    }

    public static void setContext(AppContext context) {
        LOCAL.set(context);
    }

    public static void removeContext() {
        LOCAL.remove();
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}

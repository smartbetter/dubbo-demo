package com.example.mobile.server.web.dubbo.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.AsyncRpcResult;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;
import org.slf4j.MDC;

@Activate(group = {CommonConstants.CONSUMER})
public class DubboConsumerFilter implements Filter, Filter.Listener {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result result = invoker.invoke(invocation);

        if (result.hasException()) {
            // 发生异常
            // 打印 _com_dubbo_failure 日志

        } else {
            try {
                if (result instanceof AsyncRpcResult) {
                    // 异步
                    // 打印 _com_dubbo_success 或者 _com_dubbo_failure 日志
                } else {
                    // 同步
                    // 打印 _com_dubbo_success 或者 _com_dubbo_failure 日志
                }
            } catch (Exception e) {
                // 打印 _exception 异常日志

            } finally {
                MDC.clear();
            }
        }
        return result;
    }

    @Override
    public void onResponse(Result appResponse, Invoker<?> invoker, Invocation invocation) {
    }

    @Override
    public void onError(Throwable t, Invoker<?> invoker, Invocation invocation) {
        // 服务列表
        String protocolServiceKey = invocation.getProtocolServiceKey();
        // 异常类型
        String name = t.getClass().getName();
        // 发送一些错误通知到dingding
    }
}

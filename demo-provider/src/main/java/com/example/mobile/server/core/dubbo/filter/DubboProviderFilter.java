package com.example.mobile.server.core.dubbo.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.AsyncRpcResult;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;
import org.slf4j.MDC;

@Activate(group = {CommonConstants.PROVIDER})
public class DubboProviderFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        // 初始化上下文
        // 打印 _com_request_in 日志

        Result result = invoker.invoke(invocation);

        if (result.hasException()) {
            // 发生异常
            // 打印 _com_request_out 日志

        } else {
            try {
                if (result instanceof AsyncRpcResult) {
                    // 异步
                    // 打印 _com_request_out 日志
                } else {
                    // 同步
                    // 打印 _com_request_out 日志
                }
            } catch (Exception e) {
                // 打印 _exception 异常日志

            } finally {
                MDC.clear();
            }
        }
        return result;
    }
}

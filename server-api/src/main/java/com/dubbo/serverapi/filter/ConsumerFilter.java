package com.dubbo.serverapi.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import lombok.extern.slf4j.Slf4j;

/**
 * 测试用Filter
 *
 * @author ahuang
 * @version V1.0
 * @Title: TestFilter
 * @Program: DubboDemo
 * @Package com.dubbo.server.filter
 * @create 2018-09-21 22:53
 */
@Slf4j
@Activate(group = {Constants.CONSUMER}, order = -8000)
public class ConsumerFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        long startTime = System.currentTimeMillis();
        RpcContext context = RpcContext.getContext();
        log.info("开始消费其他dubbo服务--filter");
        log.info("context.Attachments:" + context.getAttachments().toString());
        log.info("invocation.Attachments:" + invocation.getAttachments().toString());
        log.info("RemoteAddressString:" + context.getRemoteAddressString());
        log.info("MethodName:" + context.getMethodName());
        log.info("Argument:" + context.getArguments()[0].toString());
        Result result = invoker.invoke(invocation);
        log.info("结束消费其他dubbo服务--filter，耗时：" + (System.currentTimeMillis() - startTime) + "ms");
        log.info("context.Attachments:" + context.getAttachments().toString());
        log.info("invocation.Attachments:" + invocation.getAttachments().toString());
        return result;
    }
}

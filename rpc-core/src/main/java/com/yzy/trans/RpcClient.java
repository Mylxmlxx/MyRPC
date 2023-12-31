package com.yzy.trans;

import com.yzy.rpc.entity.RpcRequest;
import com.yzy.serializer.CommonSerializer;

/**
 * @author yzy
 * @version 1.0
 * @description rpc客户端
 * @date 2023/8/22 18:16
 */
public interface RpcClient {
    int DEFAULT_SERIALIZER = CommonSerializer.DEFAULT_SERIALIZER;

    /**
     * 发送RPC请求
     *
     * @param rpcRequest rpc请求
     * @return 调用结果
     */
    Object sendRequest(RpcRequest rpcRequest);

}

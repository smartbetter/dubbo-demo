package com.example.mobile.server.core.service;

import com.example.mobile.server.core.service.param.QueryTestParam;
import com.example.mobile.server.core.service.vo.QueryTestVo;

public interface SimpleService {
    /**
     * 查询test信息
     *
     * @param param 请求参数
     * @return 响应结果
     */
    QueryTestVo queryTest(QueryTestParam param);
}

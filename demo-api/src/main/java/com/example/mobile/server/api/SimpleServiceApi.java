package com.example.mobile.server.api;

import com.example.mobile.server.api.dto.ResponseCommonDto;
import com.example.mobile.server.api.dto.request.QueryTestRequestDto;
import com.example.mobile.server.api.dto.response.QueryTestResponseDto;

public interface SimpleServiceApi {
    /**
     * 查询test信息
     *
     * @param request 请求参数
     * @return 响应结果
     */
    ResponseCommonDto<QueryTestResponseDto> queryTest(QueryTestRequestDto request);
}

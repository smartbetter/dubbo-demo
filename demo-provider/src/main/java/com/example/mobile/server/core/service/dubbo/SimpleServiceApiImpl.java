package com.example.mobile.server.core.service.dubbo;

import com.example.mobile.server.api.SimpleServiceApi;
import com.example.mobile.server.api.dto.ResponseCommonDto;
import com.example.mobile.server.api.dto.request.QueryTestRequestDto;
import com.example.mobile.server.api.dto.response.QueryTestResponseDto;
import com.example.mobile.server.core.service.SimpleService;
import com.example.mobile.server.core.service.param.QueryTestParam;
import com.example.mobile.server.core.service.vo.QueryTestVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@DubboService(version = "${dubbo.simple-service.version}", group = "${dubbo.simple-service.group}")
public class SimpleServiceApiImpl implements SimpleServiceApi {

    @Autowired
    private SimpleService simpleService;

    @Override
    public ResponseCommonDto<QueryTestResponseDto> queryTest(QueryTestRequestDto request) {
        QueryTestParam param = new QueryTestParam();
        BeanUtils.copyProperties(request, param);

        QueryTestVo vo = simpleService.queryTest(param);
        QueryTestResponseDto dto = new QueryTestResponseDto();
        BeanUtils.copyProperties(vo, dto);
        return new ResponseCommonDto<>(0, "", dto);
    }
}

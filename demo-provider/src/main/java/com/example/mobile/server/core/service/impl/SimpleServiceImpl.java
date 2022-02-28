package com.example.mobile.server.core.service.impl;

import com.example.mobile.server.core.service.SimpleService;
import com.example.mobile.server.core.service.param.QueryTestParam;
import com.example.mobile.server.core.service.vo.QueryTestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SimpleServiceImpl implements SimpleService {

    @Override
    public QueryTestVo queryTest(QueryTestParam param) {
        // mock
        QueryTestVo vo = new QueryTestVo();
        vo.setTestId(System.currentTimeMillis());
        vo.setUid("100001000010001");
        vo.setCreateTime("2022-01-01 00:00:00");
        return vo;
    }
}

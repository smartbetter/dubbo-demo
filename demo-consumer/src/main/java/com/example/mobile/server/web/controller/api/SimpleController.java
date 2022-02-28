package com.example.mobile.server.web.controller.api;

import com.example.mobile.server.api.SimpleServiceApi;
import com.example.mobile.server.api.dto.request.QueryTestRequestDto;
import com.example.mobile.server.web.controller.param.QueryTestParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * the simple controller
 * <p>
 * client post headers is Content-Type:application/json
 *
 * @since 2018/10/01
 */
@Controller
@Slf4j
public class SimpleController {

    @DubboReference(version = "${dubbo.simple-service.version}", group = "${dubbo.simple-service.group}")
    private SimpleServiceApi simpleServiceApi;

    /**
     * curl http://127.0.0.1:8080/demo-consumer/api/v1/queryTest -X POST -d '{"testId":1,"uid":"1"}' --header "Content-Type:application/json"
     *
     * @param param 请求参数
     * @return 响应结果
     */
    @PostMapping(value = "/api/v1/queryTest", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object queryTest(@RequestBody @Validated QueryTestParam param) {
        QueryTestRequestDto request = new QueryTestRequestDto();
        request.setCaller("mobile-simple");
        request.setTestId(param.getTestId());
        request.setUid(param.getUid());
        return simpleServiceApi.queryTest(request);
    }
}

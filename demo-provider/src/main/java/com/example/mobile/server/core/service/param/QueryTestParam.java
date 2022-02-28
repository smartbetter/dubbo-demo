package com.example.mobile.server.core.service.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class QueryTestParam {
    @NotNull(message = "testId不能为空")
    private Long testId;

    @NotEmpty(message = "uid不能为空")
    private String uid;
}

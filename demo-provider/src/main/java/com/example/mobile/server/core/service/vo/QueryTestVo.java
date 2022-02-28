package com.example.mobile.server.core.service.vo;

import lombok.Data;

@Data
public class QueryTestVo {
    /**
     * testId
     */
    private Long testId;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 创建时间
     */
    private String createTime;
}

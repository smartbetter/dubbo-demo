package com.example.mobile.server.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QueryTestResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;

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

package com.example.mobile.server.api.dto.request;

import com.example.mobile.server.api.dto.RequestCommonDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class QueryTestRequestDto extends RequestCommonDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long testId;

    private String uid;
}

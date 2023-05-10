package com.neighborfood.neighborfoodback.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResponseDTO {
    private String result;
    private String error;
    private Object data;
}

package com.lqjq;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ResponseEntity {
    private Integer rtCode;
    private String rtMsg;
    private Object Data;
}

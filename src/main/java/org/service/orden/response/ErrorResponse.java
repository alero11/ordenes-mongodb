package org.service.orden.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {

    private String application;
    private int status;
    private String error;
    private String path;
    private String message;
    private LocalDateTime dateTime;
}

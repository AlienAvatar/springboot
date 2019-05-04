package com.example.myproject.common;

import org.springframework.stereotype.Component;

@Component("webResponse")
public class WebResponse {

    private Integer statusCode;
    private String statusMsg;
    private String version;
    private String token;


}

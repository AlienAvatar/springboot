package com.example.myproject.common;

import org.springframework.stereotype.Component;

@Component("webResponse")
public class WebResponse {

    private Integer statusCode;
    private String statusMsg;
    private String version;
    private String token;
    private String data;

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private WebResponse instance;

    public WebResponse getWebResponse(Integer statusCode, String statusMsg, String data, String token) {
        instance = new WebResponse();
        instance.setStatusCode(statusCode);
        instance.setStatusMsg(statusMsg);
        instance.setData(data);
        instance.setToken(token);
        return instance;// data
    }
}

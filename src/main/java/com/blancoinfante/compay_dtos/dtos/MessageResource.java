package com.blancoinfante.compay_dtos.dtos;

public class MessageResource {
    public enum Result{
        SUCCESS,
        FAILURE,
        ERROR
    }

    String message;
    Result result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public MessageResource(String message, Result result) {
        this.message = message;
        this.result = result;
    }
}

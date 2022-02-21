package com.blancoinfante.compay_dtos.dtos;

import java.util.List;

public class Response <T>{
    List<MessageResource> messageResources;
    T response;

    public List<MessageResource> getMessageResources() {
        return messageResources;
    }

    public void setMessageResources(List<MessageResource> messageResources) {
        this.messageResources = messageResources;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public Response(List<MessageResource> messageResources, T response) {
        this.messageResources = messageResources;
        this.response = response;
    }
}

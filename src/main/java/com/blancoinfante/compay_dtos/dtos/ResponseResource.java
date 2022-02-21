package com.blancoinfante.compay_dtos.dtos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class ResponseResource <T> extends ResponseEntity {
    public ResponseResource(Response response, HttpStatus status) {
        super(response, status);
    }
}

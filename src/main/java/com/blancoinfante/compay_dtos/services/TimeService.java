package com.blancoinfante.compay_dtos.services;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TimeService {
    //TODO: Handle all time related methods
    public long getTimeInMillis(){
        Date date = new Date();
        return date.getTime();
    }
}

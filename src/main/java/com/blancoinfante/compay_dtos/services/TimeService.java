package com.blancoinfante.compay_dtos.services;

import java.util.Date;
public class TimeService {
    //TODO: Make this a service. Not an object to be created.
    public long getTimeInMillis(){
        Date date = new Date();
        return date.getTime();
    }
}

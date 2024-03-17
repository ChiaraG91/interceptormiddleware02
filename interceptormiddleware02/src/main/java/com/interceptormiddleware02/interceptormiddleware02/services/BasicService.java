package com.interceptormiddleware02.interceptormiddleware02.services;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

    public String hello(){
        String saluto = "Benvenuti";
        return saluto;
    }
}

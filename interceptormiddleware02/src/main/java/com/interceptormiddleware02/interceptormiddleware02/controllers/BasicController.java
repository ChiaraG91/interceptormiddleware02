package com.interceptormiddleware02.interceptormiddleware02.controllers;

import com.interceptormiddleware02.interceptormiddleware02.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping
    public ResponseEntity<String> getDateTime(){
        return ResponseEntity.ok().body(basicService.hello());
    }


}

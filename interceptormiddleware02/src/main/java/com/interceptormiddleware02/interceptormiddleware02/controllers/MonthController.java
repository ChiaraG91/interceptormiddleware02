package com.interceptormiddleware02.interceptormiddleware02.controllers;

import com.interceptormiddleware02.interceptormiddleware02.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/months")
public class MonthController {

    @Autowired
    private MonthService monthService;

    /*
    @GetMapping
    public ResponseEntity<Optional<Month>> getMonth(Long id){
        return ResponseEntity.ok().body(monthService.getMonth(id));
    }

     */

    @GetMapping
    public Month getMonth(HttpServletRequest request) {
        Month month = (Month) request.getAttribute("month");
        return month;
    }
}

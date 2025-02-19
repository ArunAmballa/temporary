package com.arun.temporary.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    @GetMapping
    public String helloEmployee(){
        return "Hello Employee";
    }


    @GetMapping(path = "/allEmployees")
    public String getAllEmployees(){
        return "Getting All Employees";
    }


    @GetMapping(path = "/singleEmployee")
    public String getEmployee(){
        return "Getting a Single Employee";
    }
}




package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController
{
    @GetMapping("/myLoan")
    public String getLoanDetail()
    {
        return "This is my loan details";
    }
}

package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController
{
    @GetMapping("/notice")
    public String getNoticeDetail()
    {
        return "This is my notice details";
    }
}

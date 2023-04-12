package com.codestates.TodoApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoApp {
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "To-do Application !";
    }
}
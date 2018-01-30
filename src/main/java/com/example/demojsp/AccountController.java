package com.example.demojsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

    Map<Long, Account> accounts = new ConcurrentHashMap<>();

    @RequestMapping(method = RequestMethod.GET)
    public String getHello(Model model){
        model.addAttribute("hello", "hello");
        return "hello";
    }
}

package vn.garena.lqmb.lqmb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.garena.lqmb.lqmb.services.AccountService;

@RestController
@RequestMapping("/")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/login")
    public String login(String username, String password){
        return accountService.login(username, password);
    }
}

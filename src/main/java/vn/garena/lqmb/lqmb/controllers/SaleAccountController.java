package vn.garena.lqmb.lqmb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.garena.lqmb.lqmb.entities.SaleAccount;
import vn.garena.lqmb.lqmb.services.SaleAccountService;

import java.util.List;

@RestController
@RequestMapping("/saleAccount")
public class SaleAccountController {
    @Autowired
    SaleAccountService saleAccountService;

    @GetMapping
    public List<SaleAccount> getAll(){
        return saleAccountService.getAll();
    }
}

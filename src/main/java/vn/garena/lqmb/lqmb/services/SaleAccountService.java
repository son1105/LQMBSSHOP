package vn.garena.lqmb.lqmb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.garena.lqmb.lqmb.entities.SaleAccount;
import vn.garena.lqmb.lqmb.repositories.SaleAccountRepository;

import java.util.List;

@Service
public class SaleAccountService {
    @Autowired
    SaleAccountRepository repository;

    public List<SaleAccount> getAll(){
        return repository.findAll();
    }
}

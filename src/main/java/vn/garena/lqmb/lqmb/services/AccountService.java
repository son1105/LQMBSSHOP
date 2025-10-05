package vn.garena.lqmb.lqmb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.garena.lqmb.lqmb.entities.Account;
import vn.garena.lqmb.lqmb.repositories.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public String login(String username, String password) {
        Account account = accountRepository.findFirstByUsernameAndPassword(username, password);
        if(account == null)
            return "Dang nhap that bai roi";
        return "Dang nhap thanh cong";
    }
}

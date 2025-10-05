package vn.garena.lqmb.lqmb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.garena.lqmb.lqmb.repositories.SaleAccountRepository;
import vn.garena.lqmb.lqmb.services.SaleAccountService;

@SpringBootApplication
public class LqmbApplication {

    public static void main(String[] args) {
        SpringApplication.run(LqmbApplication.class, args);
    }


}

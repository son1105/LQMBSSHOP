package vn.garena.lqmb.lqmb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.garena.lqmb.lqmb.entities.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    Account findFirstByUsernameAndPassword(String username,String password);
}

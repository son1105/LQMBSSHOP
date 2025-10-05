package vn.garena.lqmb.lqmb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.garena.lqmb.lqmb.entities.SaleAccount;

@Repository
public interface SaleAccountRepository extends MongoRepository<SaleAccount, String> {
}

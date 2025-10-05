package vn.garena.lqmb.lqmb.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "saleHistory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleHistory {
    private String username;
    private List<SaleAccount> saleAccounts;
}

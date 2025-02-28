package ma.enset.Projet_Spring_Angular_JWT.dtos;

import lombok.Data;
import ma.enset.Projet_Spring_Angular_JWT.enums.AccountStatus;

import java.util.Date;


@Data
public  class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private Date createdAt;
    private double balance;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}

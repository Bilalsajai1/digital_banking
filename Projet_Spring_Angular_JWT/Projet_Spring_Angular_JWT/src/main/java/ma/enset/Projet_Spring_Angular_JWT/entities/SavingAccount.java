package ma.enset.Projet_Spring_Angular_JWT.entities;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("SA")
@Data

public class SavingAccount extends BankAccount{
    private double interestRate;
}

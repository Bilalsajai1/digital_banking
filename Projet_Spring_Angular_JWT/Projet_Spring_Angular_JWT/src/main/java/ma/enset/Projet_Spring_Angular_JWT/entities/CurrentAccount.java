package ma.enset.Projet_Spring_Angular_JWT.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("CURR")

public class CurrentAccount extends BankAccount{
    private double overDraft;
}

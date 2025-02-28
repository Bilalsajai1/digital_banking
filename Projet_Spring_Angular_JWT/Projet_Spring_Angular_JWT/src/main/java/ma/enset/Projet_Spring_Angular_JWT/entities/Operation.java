package ma.enset.Projet_Spring_Angular_JWT.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.Projet_Spring_Angular_JWT.enums.OpType;


import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date date;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OpType type;
    @ManyToOne
    private BankAccount bankAccount;
    private String description;
}

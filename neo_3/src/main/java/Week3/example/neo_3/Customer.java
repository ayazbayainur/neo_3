package Week3.example.neo_3;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import javax.validation.constraints.NotNull;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private String email;
    private String telephone_number;

    public Customer(Long id, String firstName, String secondName, String email, String telephone_number){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.telephone_number = telephone_number;
    }

}

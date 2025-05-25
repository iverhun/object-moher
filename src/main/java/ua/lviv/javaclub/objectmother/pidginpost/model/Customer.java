package ua.lviv.javaclub.objectmother.pidginpost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @OneToMany
    private List<Phone> phones;

    @OneToOne
    private Branch defaultBranch;
}

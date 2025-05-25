package ua.lviv.javaclub.objectmother.pidginpost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BranchRule {
    @Id
    private Long id;

    @ManyToOne
    private Branch branch;
    private String name;
    private String rule;
    private String description;
}

package ua.lviv.javaclub.objectmother.pidginpost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    @Id
    private Long id;
    private String countryCode;
    private String areaCode;
    private String number;
}

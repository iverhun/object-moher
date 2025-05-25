package ua.lviv.javaclub.objectmother.pidginpost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Delivery {
    @Id
    private Long id;
    private String trackingNumber;
    private String status;

    @OneToOne
    private Customer sender;

    @OneToOne
    private Customer receiver;

    @OneToOne
    private Branch senderBranch;

    @OneToOne
    private Branch deliveryBranch;

    private String paymentMethod;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
    private double totalAmount;
}

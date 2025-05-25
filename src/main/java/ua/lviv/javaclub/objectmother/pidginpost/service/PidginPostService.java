package ua.lviv.javaclub.objectmother.pidginpost.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.lviv.javaclub.objectmother.pidginpost.model.Delivery;
import ua.lviv.javaclub.objectmother.pidginpost.repository.DeliveryRepository;

@Service
@RequiredArgsConstructor
public class PidginPostService {
    private final DeliveryRepository deliveryRepository;

    public void sendPackage(Delivery delivery) {
        System.out.println("Sending package to " + delivery);
        deliveryRepository.save(delivery);
    }
}

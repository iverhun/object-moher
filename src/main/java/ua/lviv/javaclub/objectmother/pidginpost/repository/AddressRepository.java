package ua.lviv.javaclub.objectmother.pidginpost.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.javaclub.objectmother.pidginpost.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

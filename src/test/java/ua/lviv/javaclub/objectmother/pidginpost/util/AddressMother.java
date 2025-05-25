package ua.lviv.javaclub.objectmother.pidginpost.util;

import org.springframework.stereotype.Service;
import ua.lviv.javaclub.objectmother.pidginpost.model.Address;
import ua.lviv.javaclub.objectmother.pidginpost.repository.AddressRepository;

@Service
public class AddressMother {
    private final Address address;
    private final AddressRepository addressRepository;

    public AddressMother(AddressRepository addressRepository) {
        this.address = new Address();
        this.addressRepository = addressRepository;
    }

    public AddressMother withStreet(String street) {
        this.address.setStreet(street);
        return this;
    }

    public AddressMother withCity(String city) {
        this.address.setCity(city);
        return this;
    }

    public AddressMother withState(String state) {
        this.address.setState(state);
        return this;
    }

    public AddressMother withZipCode(String zipCode) {
        this.address.setZipCode(zipCode);
        return this;
    }

    public AddressMother withDefaultValues() {
        this.address.setStreet("123 Main St");
        this.address.setCity("Springfield");
        this.address.setState("IL");
        this.address.setZipCode("62704");
        return this;
    }

    public AddressMother lvivGorodotska23() {
        this.address.setStreet("Gorodotska");
        this.address.setCity("Lviv");
        this.address.setState("Lviv");
        this.address.setZipCode("79000");
        return this;
    }

    public AddressMother kyivHreshchatyk32() {
        this.address.setStreet("Hreshcatyl");
        this.address.setCity("Kyiv");
        this.address.setState("Kyiv");
        this.address.setZipCode("01001");
        return this;
    }


    public Address build() {
        return this.address;
    }

    public Address save() {
        if (addressRepository == null) {
            throw new IllegalStateException("AddressRepository is not set");
        }
        return addressRepository.save(address);
    }
}

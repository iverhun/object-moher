package ua.lviv.javaclub.objectmother.pidginpost.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ua.lviv.javaclub.objectmother.pidginpost.model.Address;
import ua.lviv.javaclub.objectmother.pidginpost.util.ObjectMother;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressRepositoryTest {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ObjectMother given;

    @BeforeEach
    public void setUp() {
        addressRepository.deleteAll();
    }

    @Test
    public void test_findAll_empty() {
        assertThat(addressRepository.findAll()).isEmpty();
    }

    @Test
    public void test_create_ok() {
        // Given
        var address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Springfield");
        address.setState("IL");
        address.setZipCode("62704");

        // When
        var savedAddress = addressRepository.save(address);

        // Then
        assertNotNull(savedAddress.getId());
        assertEquals(address.getStreet(), savedAddress.getStreerror: src refspec refs/heads/main does not match any
        et());
        assertEquals(address.getCity(), savedAddress.getCity());
    }


    @Test
    public void test_create_ok_mother() {
        // Given
        var address = given.address()
        .withStreet("123 Main St")
                .withState("IL")
                .withCity("Springfield").build();

                //withDefaultValues().build();

        // When
        var savedAddress = addressRepository.save(address);

        // Then
        assertNotNull(savedAddress.getId());
        assertEquals(address.getStreet(), savedAddress.getStreet());
        assertEquals(address.getCity(), savedAddress.getCity());
    }

}
package ua.lviv.javaclub.objectmother.pidginpost.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ua.lviv.javaclub.objectmother.pidginpost.model.Address;
import ua.lviv.javaclub.objectmother.pidginpost.model.Branch;
import ua.lviv.javaclub.objectmother.pidginpost.util.AddressMother;
import ua.lviv.javaclub.objectmother.pidginpost.util.BranchMother;
import ua.lviv.javaclub.objectmother.pidginpost.util.ObjectMother;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BranchRepositoryTest {

    @Autowired
    private BranchRepository branchRepository;

//    @Autowired
//    private AddressRepository addressRepository;

    @Autowired
    private AddressMother addressMother;

    @Autowired
    private BranchMother branchMother;
//
//    @Autowired
//    private ObjectMother given;

    @BeforeEach
    public void setUp() {
        branchRepository.deleteAll();
    }
//
//    @Test
//    public void test_create_ok() {
//        // Given
//        var address = new Address();
//        address.setStreet("123 Main St");
//        address.setCity("Springfield");
//        address.setState("IL");
//        address.setZipCode("62704");
//        addressRepository.save(address);
//
//        var branch = new Branch();
//        branch.setAddress(address);
//
//        // When
//        var savedAddress = branchRepository.save(branch);
//
//        // Then
//        assertNotNull(savedAddress.getId());
//    }
//
//    @Test
//    public void test_create_ok_mother() {
//        // Given
//        var address = given.address().withDefaultValues().save();
//        var branch = given.branch().withAddress(address).build();
//
//        // When
//        var savedAddress = branchRepository.save(branch);
//
//        // Then
//        assertNotNull(savedAddress.getId());
//    }

    @Test
    public void test_create_ok_mother_autowired() {
        // Given
        var address = addressMother.withDefaultValues().save();
        var branch = branchMother.withAddress(address).build();

        // When
        var savedAddress = branchRepository.save(branch);

        // Then
        assertNotNull(savedAddress.getId());
    }
}
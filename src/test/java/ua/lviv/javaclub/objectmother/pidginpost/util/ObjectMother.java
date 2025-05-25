package ua.lviv.javaclub.objectmother.pidginpost.util;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.lviv.javaclub.objectmother.pidginpost.repository.AddressRepository;
import ua.lviv.javaclub.objectmother.pidginpost.repository.BranchRepository;

@Service
@RequiredArgsConstructor
public class ObjectMother {

    // This class is used to create test data for the application
    // It uses the Builder pattern to create objects with default values
    // and allows for customization of specific fields as needed

    // Example usage:
    // var address = AddressMother.createAddress();
    // var branch = BranchMother.createBranch(address);

    private final AddressRepository addressRepository;
    private final BranchRepository branchRepository;

    public AddressMother address() {
        return new AddressMother(addressRepository);
    }

    public BranchMother branch() {
        return new BranchMother(branchRepository);
    }
}

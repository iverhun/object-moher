package ua.lviv.javaclub.objectmother.pidginpost.util;

import org.springframework.stereotype.Service;
import ua.lviv.javaclub.objectmother.pidginpost.model.Address;
import ua.lviv.javaclub.objectmother.pidginpost.model.Branch;
import ua.lviv.javaclub.objectmother.pidginpost.repository.BranchRepository;

@Service
public class BranchMother {
    private final Branch branch;
    private final BranchRepository branchRepository;

    public BranchMother(BranchRepository branchRepository) {
        this.branch = new Branch();
        this.branchRepository = branchRepository;
    }

    public BranchMother withAddress(Address address) {
        this.branch.setAddress(address);
        return this;
    }

    public BranchMother withDefaultValues() {
        this.branch.setNumber(134);
        return this;
    }

    public Branch build() {
        return this.branch;
    }

    public Branch save() {
        if (branchRepository == null) {
            throw new IllegalStateException("BranchRepository is not set");
        }
        return branchRepository.save(branch);
    }
}

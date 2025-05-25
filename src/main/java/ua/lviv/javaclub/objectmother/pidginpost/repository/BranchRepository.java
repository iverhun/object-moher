package ua.lviv.javaclub.objectmother.pidginpost.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.javaclub.objectmother.pidginpost.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}

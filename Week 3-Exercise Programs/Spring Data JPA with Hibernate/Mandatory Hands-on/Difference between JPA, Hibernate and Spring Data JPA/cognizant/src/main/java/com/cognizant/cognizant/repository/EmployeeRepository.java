package com.cognizant.cognizant.repository;

import com.cognizant.cognizant.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

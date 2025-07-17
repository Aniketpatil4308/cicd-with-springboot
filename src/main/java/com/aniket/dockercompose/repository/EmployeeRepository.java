package com.aniket.dockercompose.repository;

import com.aniket.dockercompose.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String > {

}

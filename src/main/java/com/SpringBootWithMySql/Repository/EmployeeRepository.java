package com.SpringBootWithMySql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootWithMySql.Entitys.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByUsername(String username);
}

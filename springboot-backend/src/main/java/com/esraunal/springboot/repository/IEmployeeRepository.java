package com.esraunal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esraunal.springboot.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}

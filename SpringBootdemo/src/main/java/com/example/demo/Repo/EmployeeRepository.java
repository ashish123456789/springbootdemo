package com.example.demo.Repo;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Id> {

 Employee findById(int id);
}

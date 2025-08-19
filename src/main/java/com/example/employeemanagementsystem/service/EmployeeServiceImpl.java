package com.example.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName((employee).getName());
            existing.setDepartment(employee.getDepartment());
            existing.setEmail(employee.getEmail());
            existing.setSalary(employee.getSalary());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
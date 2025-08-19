package com.example.employeemanagementsystem.service;

import java.util.List;

import com.example.employeemanagementsystem.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
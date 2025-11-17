package com.example.employeeapp.service;

import com.example.employeeapp.model.Employee;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    @PostConstruct
    public void init() {
        employees.add(new Employee(1, "Pallavi", "Intern"));
        employees.add(new Employee(2, "Ravi", "Developer"));
        employees.add(new Employee(3, "Anita", "Tester"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream()
                        .filter(emp -> emp.getId() == id)
                        .findFirst()
                        .orElse(null);
    }
}

package org.example.DAO;

import org.example.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployes();
    Employee getEmployeeById(int id);
    void createEmployee(Employee employee);

    void updateEmployee(Employee employee, int id);

    void deleteEmployee(int id);
}


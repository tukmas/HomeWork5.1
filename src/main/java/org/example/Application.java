package org.example;

import org.example.DAO.EmployeeDAO;
import org.example.DAO.EmployeeDAOImpl;
import org.example.model.Employee;

import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee1 = new Employee(1, "Сергей", "Тукмачев", "М", 26, 1);

        employeeDAO.createEmployee(employee1);

        System.out.println(employeeDAO.getEmployeeById(1));

        List<Employee> list = employeeDAO.getAllEmployes();
        for (Employee book : list) {
            System.out.println(book);
        }
        Employee employee2 = new Employee(2, "Евгений", "Колпаков", "М", 25, 1);

        employeeDAO.updateEmployee(employee2);

        employeeDAO.deleteEmployee(employee2);
    }
}
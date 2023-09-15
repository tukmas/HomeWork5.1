package org.example;

import org.example.DAO.CityDao;
import org.example.DAO.CityDaoImpl;
import org.example.DAO.EmployeeDAO;
import org.example.DAO.EmployeeDAOImpl;
import org.example.model.Employee;
import org.example.model.City;

import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDao cityDao = new CityDaoImpl();
        Employee employee1 = new Employee(1, "Сергей", "Тукмачев", "М", 26, 1);
        City city = cityDao.getCityById(cityDao.addCity(new City("Ижевск", null)));

        employeeDAO.createEmployee(employee1);
        cityDao.addCity(city);

        System.out.println(employeeDAO.getEmployeeById(1));

        List<Employee> list = employeeDAO.getAllEmployes();
        for (Employee employee : list) {
            System.out.println(employee);
        }
        Employee employee2 = new Employee(2, "Евгений", "Колпаков", "М", 25, 1);

        employeeDAO.updateEmployee(employee2);
        cityDao.updateCity(city);
        employeeDAO.deleteEmployee(employee2);
        cityDao.deleteCity(city);
    }
}
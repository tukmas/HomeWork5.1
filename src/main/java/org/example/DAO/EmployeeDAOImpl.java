package org.example.DAO;

import org.example.Hibernate.HibernateSessionFactoryUtil;
import org.example.model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    final String user = "postgres";
    final String password = "Zxc13579";
    final String url = "jdbc:postgresql://localhost:5432/skypro";

    @Override
    public List<Employee> getAllEmployes() {
        List<Employee> users = (List<Employee>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Employee").list();
        return users;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
    }

    @Override
    public void createEmployee(Employee employee) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    @Override
    public void updateEmployee (Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}
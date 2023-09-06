package org.example;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String password = "123456789qwe";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT first_name, " +
                             "last_name, gender, age, city_id FROM employee where id = 2")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String nameOfEmployee = resultSet.getString("first_name");
                String lastNameOfEmployee = resultSet.getString("last_name");
                String genderOfEmployee = resultSet.getString("gender");
                int ageOfEmployee = resultSet.getInt("age");
                int cityIdOfEmployee = resultSet.getInt("city_id");

                System.out.println(nameOfEmployee);
                System.out.println(lastNameOfEmployee);
                System.out.println(genderOfEmployee);
                System.out.println(ageOfEmployee);
                System.out.println(cityIdOfEmployee);
            }

        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных!");
            e.printStackTrace();
        }
    }
}
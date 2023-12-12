package org.example.conexiune;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplu1 {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/curs14",
                "root",
                ""

        );


        Statement statement = connection.createStatement();

                                                      //id   //nume   //varsta
        String sql = "INSERT INTO utilizatori VALUES (null, 'Gigel', '30')";

        String sql2 = "INSERT INTO angajati (id, nume, varsta, prenume) VALUES (560, 'Ana', '40', 'Andronache')";

        statement.execute(sql2);






    }
}

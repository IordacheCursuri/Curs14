package org.example.conexiune;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplu2 {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/curs14",
                "root",
                ""

        );

        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM utilizatori";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("nume"));
            System.out.println(resultSet.getString("varsta"));
            System.out.println("**************************************");
        }









    }

}

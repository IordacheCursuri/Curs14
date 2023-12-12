package org.example.conexiune;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplu3 {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/curs14",
                "root",
                ""

        );


       Statement statement = connection.createStatement();

       String sql = "DELETE FROM angajati WHERE id = 1";

       statement.execute(sql);

//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setInt(1, 1);
//        preparedStatement.executeUpdate();


    }
}

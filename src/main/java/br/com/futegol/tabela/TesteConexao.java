package br.com.futegol.tabela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
         System.out.println(connection);
    }

}

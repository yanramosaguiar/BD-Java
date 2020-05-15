/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroexerciciobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Yan
 */
public class PrimeiroExercicioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection conexao = (Connection) DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql", "root", "root");
        
        Statement stmt = conexao.createStatement();
        
        ResultSet rs = stmt.executeQuery("select User, "
                + "Password from user");
        
        while(rs.next()){
            System.out.println("Login:" + rs.getString("User")+
                    "  Senha:" + rs.getString("Password"));
            
        }
    }
    
}

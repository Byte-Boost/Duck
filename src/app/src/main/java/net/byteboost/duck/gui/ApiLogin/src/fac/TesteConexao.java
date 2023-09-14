/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fac;

import java.sql.Connection; 
import java.sql.SQLException;

public class TesteConexao {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        Connection connection = new connectionFac().getConnection();
         System.out.println("Conexão aberta!");
         connection.close();
    }
    }
    


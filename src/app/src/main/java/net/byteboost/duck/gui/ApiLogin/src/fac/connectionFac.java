/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fac;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author JAQUELINE
 */
public class connectionFac {
     public Connection getConnection() {
    
                 try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","Jmfvs_29*");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
}

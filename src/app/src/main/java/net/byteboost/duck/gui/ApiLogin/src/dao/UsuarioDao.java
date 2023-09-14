/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.sql.PreparedStatement;
import fac.connectionFac;
import model.Usuario;

public class UsuarioDao {
    private Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = new connectionFac().getConnection();
    }
    
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(usuario) VALUES(?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
           // String id_aux=Integer.toString(cliente.getId());
            stmt.setString(1, usuario.getUsuario());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
}

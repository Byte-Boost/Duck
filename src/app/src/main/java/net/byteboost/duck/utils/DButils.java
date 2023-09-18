package net.byteboost.duck.utils;

import net.byteboost.duck.keys.DBkeys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author @jaquemfvs
 */

public class DButils {

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(DBkeys.getSQLDatabase(), DBkeys.getSQLUser(), DBkeys.getSQLPassword());
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }

        public static void addUser(String username, String password){
            String sql = "INSERT INTO usuario(usuario) VALUES(?)";
            try {

                Connection connection =  getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, username);
                stmt.execute();
                stmt.close();
                connection.close();

            }
            catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
        }

}

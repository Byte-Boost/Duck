package net.byteboost.duck.keys;

/**
 * Contains key information about the database like SQL user  and SQL password.
 */

public class DBkeys {
    private static String SQLUser = "";
    private static String SQLPassword = "";

    private static String SQLDatabase = "jdbc:mysql://localhost:3306/";

    public static String getSQLUser(){
        return SQLUser;
    }
    public static String getSQLPassword(){
        return SQLPassword;
    }
    public static String getSQLDatabase(){
        return SQLDatabase;
    }
    public void setSQLUser(String user){
        this.SQLUser = user;
    }
    public void setSQLPassword(String password){
        this.SQLPassword = password;
    }
    public void setSQLDatabase(String database){
        this.SQLDatabase = database;
    }
}
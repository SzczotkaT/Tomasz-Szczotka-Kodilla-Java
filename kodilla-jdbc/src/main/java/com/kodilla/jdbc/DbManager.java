package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbMannagerInstance;

    private DbManager() throws SQLException{
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_user");
        connectionProps.put("password", "!Ibanez123!");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
    }

    public static DbManager getInstance() throws SQLException{
        if(dbMannagerInstance == null){
            dbMannagerInstance = new DbManager();
        }
        return dbMannagerInstance;
    }

    public Connection getConnection(){
        return conn;
    }
}

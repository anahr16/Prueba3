package com.login.demo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.sql.Connection;

public class LoginApplication {
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();
        Connection connection = databaseManager.getConnection();

        // Ahora puedes usar 'connection' para interactuar con la base de datos.
    }
}
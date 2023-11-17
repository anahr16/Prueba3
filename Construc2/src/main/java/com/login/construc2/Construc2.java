/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.login.construc2;

import java.sql.Connection;

/**
 *
 * @author anahr
 */
public class Construc2 {

    public static void main(String[] args) {
     
        DatabaseManager databaseManager = new DatabaseManager();
        Connection connection = databaseManager.getConnection();

        
    }
}

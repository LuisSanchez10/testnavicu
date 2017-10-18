/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navicu.test.modelo;
import java.sql.*;
/**
 *
 * @author devlopervit-05
 */
public class ConnectionPostgresql {
    Connection connect = null;
    
    public Connection Connectionsql(){
        try {
              Class.forName("org.postgresql.Driver");
              connect = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testnavicu","qajhbulp9q9ohj", "02805dd8226b356e1c1547c1bd313qansd");
           } catch (Exception e) {
              e.printStackTrace();
              System.err.println(e.getClass().getName()+": "+e.getMessage());
              System.exit(0);
           } 
   return connect;
}
}


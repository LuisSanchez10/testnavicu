/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navicu.test.modelo;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author devlopervit-05
 */
public class ConnectionPostgresql {
    Connection connect = null;
    
    public Connection Connectionsql(){
        try {
              Class.forName("org.postgresql.Driver");
              //connect = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testnavicu","postgres", "21239701");
              connect = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:7777/testnavicu","qajhbulp9q9ohj", "02805dd8226b356e1c1547c1bd313qansd");
           } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Hubo un error con la conexión a la BD:" + e);
           } 
   return connect;
}
}


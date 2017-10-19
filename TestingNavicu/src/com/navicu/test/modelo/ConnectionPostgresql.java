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
              connect = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testnavicu","postgres", "21239701");
           } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Hubo un error con la conexión a la BD:" + e);
           } 
   return connect;
}
}


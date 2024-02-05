/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.sql.Connection;

/**
 *
 * @author apiiit-rkv
 */
public class ConnectionFactory {
    private static HikariDataSource ds=null;
      public static Connection getConnection() throws Exception{
        if(ds==null){
     
      
      HikariConfig config=new HikariConfig();
        config.setUsername("root");
        config.setPassword("Welcome@12");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mango");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        
        ds= new HikariDataSource(config);}
       Connection con= ds.getConnection();
       return con;
               
               
        }
}

    


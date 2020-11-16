package com.producto.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	 // Connect to MySQL
	 public static Connection getMySQLConnection() throws SQLException,
	           ClassNotFoundException {
	       String hostName = "localhost";
	 
	       String dbName = "lab2020";
	       String userName = "root";
	       String password = "admin";
	 
	       return getMySQLConnection(hostName, dbName, userName, password);
	 }
	 
	 public static Connection getMySQLConnection(String hostName, String dbName,
	           String userName, String password) throws SQLException,
	           ClassNotFoundException {

	     Class.forName("com.mysql.cj.jdbc.Driver");
	 
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName, password);
	     return conn;
	 }

}

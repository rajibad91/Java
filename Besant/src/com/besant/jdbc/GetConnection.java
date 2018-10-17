package com.besant.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class GetConnection {

	public static Connection getDBConnection() {
		Connection conn=null;
		Properties prop = new Properties();

		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Personal_JAVA\\Besant\\src\\com\\besant\\jdbc\\db.properties");
			prop.load(fis);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			// Class.forName(prop.getProperty("driverClassName"));
			Connection connTry = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			conn=connTry;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

}

package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	public static Connection dbConn() {
		Connection conn = null;
		try {
			//db연결
	 		String driver = "com.mysql.jdbc.Driver";
	 		String dbUrl = "jdbc:mysql://localhost:3306/sihum";
	 		String dbId = "sihum";
	 		String dbPw = "1234";

	 		Class.forName(driver);
	 		conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}

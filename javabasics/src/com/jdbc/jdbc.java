package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";

	// Database credentials
	static final String USER = "sa";
	static final String PASS = "";

	public static void main(String[] args) throws ClassNotFoundException{
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName(JDBC_DRIVER);
// STEP 2: Open a connection
		
		System.out.println("Connecting to a selected database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connected database successfully...");

		System.out.println("Creating table in given database...");
		stmt = conn.createStatement();
		String createSql = "CREATE TABLE   REGISTRATION " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
				+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
		// stmt.execute
// STEP 3: Execute a query
		String sql = "INSERT INTO Registration " + "VALUES (100, 'Zara', 'Ali', 18)";

		// stmt.executeUpdate(sql);
		sql = "INSERT INTO Registration " + "VALUES (101, 'Mahnaz', 'Fatma', 25)";

		// stmt.executeUpdate(sql);
		sql = "INSERT INTO Registration " + "VALUES (102, 'Zaid', 'Khan', 30)";

		// stmt.executeUpdate(sql);
		sql = "INSERT INTO Registration " + "VALUES(103, 'Sumit', 'Mittal', 28)";

		// stmt.executeUpdate(sql);
		System.out.println("Inserted records into database");
        String rsql = "SELECT id, first, last, age FROM Registration";
		ResultSet rs = stmt.executeQuery(rsql);

		// STEP 4: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			int age = rs.getInt("age");
			String first = rs.getString("first");
			String last = rs.getString("last");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Age: " + age);
			System.out.print(", First: " + first);
			System.out.println(",Last:" + last);
		}
// STEP 5: Clean-up environment
		rs.close();

		// STEP 4: Clean-up environment
		stmt.close();
		conn.close();
		
		}catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(stmt!=null)
					stmt.close();
			}
			catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Bye");
	}
}
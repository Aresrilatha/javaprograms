package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	static final String JDBC_Driver="org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";
	
	static final String USER = "sa";
	static final String PASS ="";
	
	public static void main(String args[]){
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName(JDBC_Driver);
			
			System.out.println("Connecting to selected Database:");
			conn = DriverManager.getConnection(DB_URL,USER, PASS);
			System.out.println("Connected database successfully");
			
//			System.out.println("Creating table in given database");
			stmt = conn.createStatement();
//			String createSql = "CREATE TABLE STUDENT"+"(id INTEGER NOT NULL,"+"first VARCHAR(100),"+"last VARCHAR(100),"+"age INTEGER,"+"PRIMARY KEY(id))";
//			//stmt.executeUpdate(createSql);
//			System.out.println(" Table created in database");
			System.out.println("Inserting data into database");
			String sql = "INSERT INTO STUDENT VALUES(104,'Zara','Ali',18)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO STUDENT VALUES(105,'Mahnaz','Fatma',25)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO STUDENT VALUES(106,'Zaid','Khan',30)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO STUDENT VALUES(107,'Sumit','Mittal',43)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted Records into the table");
			
			String rsql = "SELECT id,first,last,age FROM STUDENT";
			ResultSet rs = stmt.executeQuery(rsql);
			
			while(rs.next()){
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");
				
				System.out.print("ID:"+id);
				System.out.print(", Age:"+age);
				System.out.print(", First Name:"+first);
				System.out.print(", Last Name:"+last);
			}
			rs.close();
			
			stmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Bye");
	}
}

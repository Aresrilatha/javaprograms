package com.student.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.model.StudentDAOException;
import com.student.model.Student;

public class StudentDao {
	static final String JDBC_DRIVER ="org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";
	
	static final String USER="sa";
	static final String PASS ="";
	
	Connection conn=null;
	public Connection getConnection() throws StudentDAOException{
		try{
			if(conn==null){
				Class.forName(JDBC_DRIVER);
				conn=DriverManager.getConnection(DB_URL, USER, PASS);
			}
			else{
				return conn;
			}
		}catch(ClassNotFoundException e){
			throw new StudentDAOException("Not able to Create DB Connection",e);
		}catch(SQLException e){
			throw new StudentDAOException("Not able to Create DB Connection",e);
		}
		System.out.println("Creating Connection");
		return conn;
	}
	
	public Statement getStatement(Connection conn) throws StudentDAOException{
		Statement stmt=null;
		try{
			stmt=conn.createStatement();
		}catch(SQLException e){
			throw new StudentDAOException("Not able Create Statement",e);
		}
		return stmt;
	}
	
	public int insertStu(Student st) throws StudentDAOException{
		Connection conn=getConnection();
		Statement stmt =getStatement(conn);
		
		String createQuery = "CREATE TABLE STUDENT1(ROLL_NO INTEGER NOT NULL ,NAME VARCHAR(60), WHICH_CLASS INTEGER, FEE INTEGER, MOBILE INTEGER,PRIMARY KEY(ROLL_NO))";
		try{
			stmt.executeUpdate(createQuery);
		}catch(SQLException e){
			throw new StudentDAOException("Not able to create table",e);
		}
		
		String insertData="INSERT INTO STUDENT1 VALUES("+ st.getRollno() +",'" +st.getName() + "'," +st.getWhichClass()+ "," +st.getfee() + "," +st.getMobile()+")";
		int res=0;
		try{
			res=stmt.executeUpdate(insertData);
		}catch(SQLException e){
			throw new StudentDAOException("Not able to Create Table",e);
		}
		return res;
	}
	
	public String updateStu(Student st) throws StudentDAOException{
		String msg ="SUCCESS";
		Connection conn= getConnection();
		Statement stmt = getStatement(conn);
		
		String updateData = "UPDATE STUDENT1 SET NAME ='"+st.getName()+"', WHICH_CLASS= "+st.getWhichClass()+", FEE ="+st.getfee()+", MOBILE = "+ st.getMobile();
		try{
			stmt.executeUpdate(updateData);
		}catch(SQLException e){
			msg="FAILED";
			throw new StudentDAOException("Not able to Update Student table",e);
		}
		return msg;
	}
	
	public String deleteStu(int rollno) throws StudentDAOException{
		String msg ="SUCCESS";
		Connection conn =getConnection();
		Statement stmt = getStatement(conn);
		String deleteData = "DELETE STUDENT1 WHERE ROLL_NO="+rollno;
		try{
			stmt.executeUpdate(deleteData);
		}catch(SQLException e){
			msg ="Failed";
			throw new StudentDAOException("Not able to delete record from table",e);
		}
		return msg;
	}
	
	public List<Student> retriveStu() throws StudentDAOException{
		Connection conn = getConnection();
		Statement stmt = getStatement(conn);
		String getData= "SELECT ROLL_NO, NAME, WHICH_CLASS, FEE, MOBILE FROM STUDENT1";
		List<Student> lst = new ArrayList<Student>();
		
		try{
			ResultSet rs = stmt.executeQuery(getData);
			while(rs.next()){
				Student st = new Student();
				st.setRollno(rs.getInt("ROLL_NO"));
				st.setName(rs.getString("NAME"));
				st.setWhichClass(rs.getInt("WHICH_CLASS"));
				st.setFee(rs.getFloat("FEE"));
				st.setMobile(rs.getLong("MOBILE"));
				
				lst.add(st);
			}
		}catch(SQLException e){
				throw new StudentDAOException("Not able to get Details from Student",e);
			}
			return lst;
		}
		
	}


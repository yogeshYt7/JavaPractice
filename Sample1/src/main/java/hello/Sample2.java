package hello;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

public class Sample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Rekha", "root", "root");
//		PreparedStatement P = c.prepareStatement("create table emp(id integer ,name varchar(20))");
		PreparedStatement P = c.prepareStatement("insert into emp  values(220,'auto anand');");
		
		P.executeUpdate();
		c.close();
		System.out.println("task complete");

	}

}

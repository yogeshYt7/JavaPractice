package hello;
import java.sql.*;
public class priya {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/Rekha","root","root");
		
		PreparedStatement p=c.prepareStatement("create table emp");
		boolean b=p.execute();
		c.close();
		System.out.println("task complete");
		
		
	}

}

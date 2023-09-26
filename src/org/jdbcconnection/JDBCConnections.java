package org.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnections {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//create the connection to database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		
		//write the queries
		String query="select * from studentss";
	
		//prepare the statements
		PreparedStatement pr = con.prepareStatement(query);
		
		//Execute the query
		ResultSet rs = pr.executeQuery();
		
		//Iterate the results
		
		while(rs.next()){
			int cid = rs.getInt("CID");
			String sname = rs.getString("SNAME");
			System.out.println(cid+"======"+sname);
		}
		
		//close the DB connection
		con.close();
		
		
		
		
		
		
		
		
		
	}

}

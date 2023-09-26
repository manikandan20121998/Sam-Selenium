package org.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCpreparation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		String query="select * from studentss";
		PreparedStatement pr = con.prepareStatement(query);
		ResultSet rs = pr.executeQuery();
		while(rs.next()) {
			int cid = rs.getInt("cid");
			String sname = rs.getString("sname");
			if (cid==10) {
				System.out.println(sname);
			}
		//	System.out.println(cid+"========="+sname);
		}
		con.close();
		
	}
}

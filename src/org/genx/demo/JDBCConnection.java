//step:2
package org.genx.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Class Loaded");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=afsaralam15");
			
			System.out.println("Connetion Establish with db server");
		}catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(con!=null)
			{
				try {
					con.close();
					System.out.println("Closed All Resources");
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		
	}

}

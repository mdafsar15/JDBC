//step:1
package org.genx.demo;


public class JDBCDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Class Loaded");
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}

package com.face.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WelcomDAO {

	public static void print_Details(Connection connection, String username) throws SQLException
	{
	Statement st=connection.createStatement();
	System.out.println(username);
	String query="SELECT *FROM Register WHERE username='"+username+"'";
	System.out.println(query);
	ResultSet rs=st.executeQuery(query);
	
	while(rs.next())
	{
		String name=rs.getString("name");
		String emailID=rs.getString("emailID");
		String PhoneNO=rs.getString("PhoneNo");
		
       System.out.println(name);
       System.out.println(emailID);
       System.out.println(PhoneNO);
	}
		
	}

	


}

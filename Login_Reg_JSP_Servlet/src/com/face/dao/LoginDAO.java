package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.BO.LoginBO;

public class LoginDAO {

	

	public static boolean Check_Valid_User(Connection connection, LoginBO lgbo) throws SQLException
	{
		System.out.println(lgbo.getUsername());
		System.out.println(lgbo.getPassword());
		boolean status=false;
		Statement st=connection.createStatement();
		
		String query="SELECT username,Password,name,emailID,PhoneNo FROM Register WHERE username='"+lgbo.getUsername()+"' AND Password='"+lgbo.getPassword()+"'";
		ResultSet rs=st.executeQuery(query);
		
		
		
		while(rs.next())
		{
			if(rs.getString(1).equals(lgbo.getUsername()) && rs.getString(2).equals(lgbo.getPassword()))
			{		
				System.out.println("login Success");
				String luser=lgbo.getUsername();
				String lpass=lgbo.getPassword();
				
			
				
				lgbo.setName(rs.getString("name"));
				lgbo.setEmailid(rs.getString("emailID"));
				lgbo.setPhoneNO(rs.getString("PhoneNo"));
				
							
				status=true;
			}
			else 
				status=false;
		}
		return status;
	}

	

	

}

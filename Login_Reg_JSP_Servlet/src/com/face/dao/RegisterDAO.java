package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.BO.RegisterBO;

public class RegisterDAO
{

	public static void save(Connection connection, RegisterBO regBO) throws SQLException
	{
		Statement st=connection.createStatement();
		String query="INSERT INTO Register values('"+regBO.getName()+"','"+regBO.getEmailId()+"','"+regBO.getUsername()+"','"+regBO.getPswd()+"','"+regBO.getPhno()+"')";
		
		int resultset=st.executeUpdate(query);
		if(resultset==1)
			System.out.println("Data inserted Suceesfully");
		else
			System.out.println("Please check");
	}

}

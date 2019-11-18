package com.face.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.BO.LoginBO;
import com.face.dao.LoginDAO;
import com.face.utility.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String Password=request.getParameter("Password");
		
		ConnectionManager con=new ConnectionManager();
		LoginBO lgbo=new LoginBO();
		
		lgbo.setUsername(username);
		lgbo.setPassword(Password);
		
		try {
		boolean status=LoginDAO.Check_Valid_User(con.getConnection(),lgbo);
		if(status==true)
		{
			
			ArrayList<String> list = new ArrayList<String>();
			list.add(lgbo.getName());
			list.add(lgbo.getEmailid());
			list.add(lgbo.getPhoneNO());
			list.add(lgbo.getUsername());
			
			request.setAttribute("data",list);
			
			String LogCredential = null;
			request.setAttribute(username,LogCredential);
		
			
			
		  RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		  rd.forward(request, response);
		}
		else
		{
			request.setAttribute("data1","Invalid Username/Password");
			  RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			  rd.forward(request, response);
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

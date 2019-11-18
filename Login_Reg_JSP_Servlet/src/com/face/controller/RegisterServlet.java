package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.BO.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.utility.ConnectionManager;

/**
* @author:Shini_Kurian
* @imp Note:User Registration
* @Date:14/11/2019
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implspec-->method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 response.setContentType("text/html");
	 String name=request.getParameter("name");
	 String emailId=request.getParameter("emailId");
	 String username=request.getParameter("username");
	 String pswd=request.getParameter("pswd");
	 String phno=request.getParameter("phno");
	 
	 RegisterBO regBO=new RegisterBO();
	 
	 regBO.setName(name);
	 regBO.setEmailId(emailId);
	 regBO.setUsername(username);
	 regBO.setPswd(pswd);
	 regBO.setPhno(phno);
	 
	 ConnectionManager con=new ConnectionManager();
	 
	 try {
		RegisterDAO.save(con.getConnection(),regBO);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

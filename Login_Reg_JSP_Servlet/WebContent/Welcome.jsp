<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
   <%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
   <%@page import="com.face.dao.LoginDAO"%>
   <%@page import="java.util.Iterator"%>
   <%@page import="java.util.List"%>

<title>welcome</title>

</head>
<body>
   <form action="/FaceBook/WelcomeServlet" method="post">
   <h1>Welcome
  <%=request.getParameter("username") %>,</h1>
  
  <table class="table table-bordered">
        <thead class="thead-dark">
          <tr>
			<th scope="col">Name</th>
			<th scope="col">EmailID</th>
			<th scope="col">PhoneNO</th>
			<th scope="col">UserName</th>
		</tr>
        </thead>
         <%Iterator itr;%>
           <% List data= (List)request.getAttribute("data");
               for (itr=data.iterator(); itr.hasNext(); )
                   {
           %>
             <tr>
               <td><%=itr.next()%></td>
               <td><%=itr.next()%></td>
               <td><%=itr.next()%></td>
               <td><%=itr.next()%></td>
           </tr>
       <%}%>
</table>

  
</form>
</body>
</html>

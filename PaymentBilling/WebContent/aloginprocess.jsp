<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="org.omg.CORBA.PUBLIC_MEMBER"%>
<%
		String username=pageContext.getServletContext().getInitParameter("Username");
		String password=pageContext.getServletContext().getInitParameter("Password");
		
if(request.getParameter("username").equalsIgnoreCase("username")&& request.getParameter("userpass").equalsIgnoreCase("userpass"))
{
session.setAttribute("islogin","plz sign in first");
%>
<jsp:forward page="ahome.jsp"></jsp:forward>
<% 
}

else{
request.setAttribute("Error","Sorry! Username or Password Error. plz Enter Correct Detail");
session.setAttribute("Loginmsg","plz sign in first");
%>
<jsp:forward page="admin.jsp"></jsp:forward>
<% 
}
%>

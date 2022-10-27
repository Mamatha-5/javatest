<%@ page import="java.sql.*"
		 import="java.text.SimpleDateFormat"
		 import="java.lang.Thread" %>

<% String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String a=request.getParameter("b1");
	
	Connection con = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","Sysdba_1");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	PreparedStatement ps = con.prepareStatement("INSERT INTO passenger(fname,lname,age,gender) VALUES(?,?,?,?)");
	ps.setString(1,fname);
	ps.setString(2,lname);
	ps.setString(3,age);
	ps.setString(4,gender);
	ps.execute();
	if(a.equals("submit"))
	{
		response.sendRedirect("payment.html");
	}
	else
	{
		response.sendRedirect("passenger.html");
	}
	%>
	

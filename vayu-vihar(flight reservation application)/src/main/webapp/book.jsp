<%@ page import="java.sql.*"
		 import="java.text.SimpleDateFormat" %>

<% String origin = request.getParameter("origin");
	String destination = request.getParameter("des");
	String tdate = request.getParameter("tdate");
	String pass = request.getParameter("pass");
	String fly = request.getParameter("fly");
    String meals = request.getParameter("meal");
	
	Connection con = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","Sysdba_1");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	PreparedStatement ps = con.prepareStatement("INSERT INTO flightbook(origin,destination,tdate,passenger,flight,meals) VALUES(?,?,?,?,?,?)");
	ps.setString(1,origin);
	ps.setString(2,destination);
	ps.setString(3,tdate);
	ps.setString(4,pass);
	ps.setString(5,fly);
	ps.setString(6,meals);
	ps.execute();
	response.sendRedirect("passenger.html");
	%>
	

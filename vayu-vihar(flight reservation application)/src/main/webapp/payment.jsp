<%@ page import="java.sql.*"
		 import="java.text.SimpleDateFormat" %>

<% String fname = request.getParameter("firstName");
	String lname = request.getParameter("lastName");
	String email = request.getParameter("email");
	String fare = request.getParameter("fare");
	String country = request.getParameter("country");
	String name = request.getParameter("cc-name");
    String number = request.getParameter("cc-number");     
    String expiry = request.getParameter("cc-expiry");
    String cvv = request.getParameter("cc-cvv");
	
	Connection con = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","Sysdba_1");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	PreparedStatement ps = con.prepareStatement("INSERT INTO paydetails(fname,lname,email,fare,country,card_name,number,expiry,cvv) VALUES(?,?,?,?,?,?,?,?,?)");
	ps.setString(1,fname);
	ps.setString(2,lname);
	ps.setString(3,email);
	ps.setString(4,fare);
	ps.setString(5,country);
	ps.setString(6,name);
	ps.setString(7,number);
	ps.setString(8,expiry);
	ps.setString(9,cvv);
	ps.execute();
	response.sendRedirect("index.html");
	%>
	

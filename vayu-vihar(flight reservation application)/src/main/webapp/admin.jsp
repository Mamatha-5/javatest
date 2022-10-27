<% String a=request.getParameter("t1");
String b=request.getParameter("t2");

if(a.equals("admin") && b.equals("admin"))
{
	response.sendRedirect("detail.html");
	}
	else
	{
		response.sendRedirect("index.html");
			}%>
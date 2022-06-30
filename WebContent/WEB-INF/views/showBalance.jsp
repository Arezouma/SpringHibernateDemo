<%@ page language="java" import="org.zodiac.hibernate.App" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance Display Page</title>
</head>
<body>
  <%
    int accno = (Integer)request.getAttribute("id");
    App app = new App();
    double balance = app.showBalance(accno);
    if(balance == 0.0)
    	out.println("<h3>Invalid Account Number. Unable to fetch balance");
    else
    	out.println("<h3>Your Existing Balance is : " + balance);
  %><br><br>
  Click <a href="./">Here</a> to Continue....
</body>
</html>
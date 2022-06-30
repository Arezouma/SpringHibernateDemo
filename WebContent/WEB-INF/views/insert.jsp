<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Creation Form</title>
</head>
<body>
 <h3 align="center">Account Opening Form </h3>
   <form action="insert">
   <table align="center" cellpadding="5">
    <tr>
     <td>Enter Account ID : </td>
     <td><input type="number" name="t1" min="201" max="299" required></td>
    </tr> 
    <tr>
     <td>Select Account Type : </td>
     <td><select name="t2">
      <option value="SB">Saving Account</option>
      <option value="CR">Current Account</option>
      <option value="RD">Recurring Account</option>
     </select></td>
    </tr> 
    <tr>
     <td>Enter Starting Balance : </td>
     <td><input type="number" name="t3" min="1000" required></td>
    </tr> 
    <tr>
     <th><input type="submit" value="CREATE ACCOUNT"></th>
     <th><input type="reset" value="CANCEL"></th>
    </tr> 
   </table>
</form><br><br>
<h3>
 Click <a href='show'>Here</a> to Check Your Account Balance
</h3>
</body>
</html>
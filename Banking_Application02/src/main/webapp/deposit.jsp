<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="banking_app.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="header-container">
		<img src="img\home.jpeg">
		<h1>BANKING APPLICATION</h1>
	</div>
	<nav>
		<ul>
			<li><a href="home.html">HOME</a></li>
			<li><a href="newaccount.html">NEW ACCOUNT</a></li>
			<li><a href="balance.html">BALANCE</a></li>
			<li><a href="deposit.html">DEPOSIT</a></li>
			<li><a href="withdraw.html">WITHDRAW</a></li>
			<li><a href="transfer.html">TRANSFER</a></li>
			<li><a href="delete.html">CLOSE A/C</a></li>
			<li><a href="about.html">ABOUT US</a></li>				
		</ul>
	</nav>



<div class="deposit-info">


</div>

<div class="deposit-info">
<%
OpenAccountBean bb=(OpenAccountBean)request.getAttribute("bean");
if(bb==null){
	out.println("please check account details");
	
%>
	<form name="p1" action="deposit" method="post">
    <label for="username">USERNAME</label>
    <input type="text" id="username" name="uname" placeholder="Enter your username" required>

    <label for="password">PASSWORD</label>
    <input type="password" id="password" name="pword" placeholder="Enter your password" required>
	
	<label for="amount">AMOUNT</label>
	<input type="text" id="amount" name="amount" placeholder="Enter Amount" required>
				            
    <input type="submit" value="SUBMIT">
    <input type="reset" value="CLEAR">
      
</form><%
}else{

out.println("Amount deposited successfully");%>
	<table>
		<tr>
				<th>ACCOUNT NO</th>
				<th>USERNAME</th>
				<th>AMOUNT</th>
				<th>ADDRESS</th>
				<th>PHONE</th>
		</tr>
		<tr>
			<td>
				<%out.println(bb.getAccountNumber());%>
			</td>
			<td>
				<%out.println(bb.getuName());%>
			</td>
			
			<td>
				<%out.println(bb.getAmount());%>
			</td>
			<td>
				<%out.println(bb.getAddress());%>
			</td>
			<td>
				<% out.println(bb.getPhn());%>
			</td>
		</tr>
	</table>
	
<%}

%>

<!-- Footer Section -->
	<footer>
    <div class="container">
      <div class="footer-content">
        <h3>Contact Us</h3>
        <p>Email:email@gmail.com</p>
        <p>Phone:+91 9999999999</p>
        <p>Address: Hyd</p>
      </div>
      <div class="footer-content">
        <h3>Quick Links</h3>
        <ul>
          <li><a href="#">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div>
    </div>
    <div class="bottom-bar">
      <p>&copy; 2024 Banking Application. All rights reserved.</p>
    </div>
  </footer>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="banking_app.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="header-container">
		<h1>BANKING APPLICATION</h1>
		<img src="img\home.jpeg">		
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
<%OpenAccountBean account=(OpenAccountBean)request.getAttribute("account");%>	
<div class="account-info-services">
	<h2>Services</h2>
	<a href="https://www.youtube.com/">Google</a>
	<a href="www.google.com">Google</a>
	<a href="www.google.com">Google</a>
</div>
<div class="account-info-details">
	<table>
		<tr>
				<th>ACCOUNT NO</th>
				<th>USERNAME</th>
				<th>PASSWORD</th>
				<th>AMOUNT</th>
				<th>ADDRESS</th>
				<th>PHONE</th>
		</tr>
		<tr>
			<td>
				<%out.println(account.getAccountNumber());%>
			</td>
			<td>
				<%out.println(account.getuName());%>
			</td>
			<td>
				<%out.println(account.getPassword());%>
			</td>
			<td>
				<%out.println(account.getAmount());%>
			</td>
			<td>
				<%out.println(account.getAddress());%>
			</td>
			<td>
				<% out.println(account.getPhn());%>
			</td>
		</tr>
	</table>
</div>

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
</body>
</html>
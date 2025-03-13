<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="banking_app.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<style>
    .bal {
        width: 100%;
        height: 500px;
        border: 2px solid black;
        padding: 20px;
        box-sizing: border-box;
    }
    
    /* Add custom styles for balance information */
    .balance-info {
        font-size: 24px;
        font-weight: bold;
        color: green;
        margin-top: 20px;
    }

    /* You can also add more custom styles for the container if needed */
    .balance-label {
        font-size: 18px;
        font-weight: normal;
        color: #333;
    }
</style>
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
	
	<div class="bal">
		<%
            OpenAccountBean bean = (OpenAccountBean) request.getAttribute("bean");
        %>
        
        <span class="balance-label">Account Balance:</span> 
        <span class="balance-info">
            <%= bean.getAmount() %>
        </span>
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #ff1648;
}

li {
	float: left;
}

li a, .dropbtn {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not(.active), .dropdown:hover .dropbtn {
	background-color: whitesmoke;
	color: black;
}

.active {
	background-color: whitesmoke;
	color: black;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #f1f1f1;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<ul>
		<li style="float: right" class="dropdown"><a href="/">Blood
				Bank Login</a>
			<div class="dropdown-content">
				<a href="#">Login</a>
			</div></li>
		<li style="float: right" class="dropdown">
		<a href="#news">Lookingfor Blood</a>
			<div class="dropdown-content">
				<a href="#">Blood Availability</a> 
				<a href="#">Blood Bank Directory</a> 
				<a href="#">Thalassemia Request</a>
			</div></li>
		<li style="float: right" class="dropdown">
		<a href="#contact">ToDonate Blood</a>
			<div class="dropdown-content">
				<a href="/bloodbank/campRegistration">Blood Donation Camps</a> 
				<a href="#">Register VBD Camp</a> 
				<a href="#">Donor Login</a> 
				<a href="#">About Blood Donation</a>
			</div></li>
		<li style="float: right" class="dropdown"><a
			href="javascript:void(0)" class="dropbtn">About Us</a>
			<div class="dropdown-content">
				<a href="/bloodbank/">Home</a> 
				<a href="/bloodbank/gallery/">Gallery</a> 
				<a href="/bloodbank/contact">Contact Us</a>
			</div></li>
	</ul>
</body>
</html>

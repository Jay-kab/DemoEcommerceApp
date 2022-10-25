<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<h2 style="text-align: center;">Ecommerce Demo Application</h2>
	<br>
	<br>


	<h3 style="text-align: center; color: Blue">Enter your Details to
		Register with us!!</h3>

	
		<form action="register" method="post">
			<div style="margin-left:auto; margin-right:auto;"
				class="form-group">

				<div>
					<label for="exampleInputEmail1">Username</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter First Name"
						name="username">
				</div>

				<div>
					<label for="exampleInputEmail1">Password</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter First Name"
						name="password">
				</div>

				<div>
					<label for="exampleInputEmail1">First Name</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter First Name"
						name="firstName">
				</div>
				<div>
					<label for="exampleInputEmail1">Last Name</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter Last Name"
						name="lastName">
				</div>
				<div>
					<label for="exampleInputEmail1">Email</label> <input type="email"
						class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter Email Address"
						name="email">
				</div>

			</div>
			<br>

			<button style="text-align:center;" type="submit"
				class="btn btn-primary">Register</button>
			<br> <br>

		</form>
	

	<h4>
		<a style="text-align:center;" href="/"><< Back to Home </a>
	</h4>

</body>
</html>
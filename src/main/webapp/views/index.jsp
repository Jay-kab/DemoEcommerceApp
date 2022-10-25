<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">

<meta charset="UTF-8">
<title>Login Page</title>

</head>
<body>
	<br>
	<br>
	<h3 style="text-align:center;">Welcome to JayStore</h3>
	<br>
	<br>

	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
						class="img-fluid" alt="Sample image">
				</div>
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="login" method="post">

						<h5 style="color: red">${loginErrorMessage }</h5>
						<h5 style="color:green;">${registrationSuccesssful }</h5>

						<!-- Email input -->
						<div class="form-outline mb-4">
							<input type="text" id="form3Example3"
								class="form-control form-control-lg"
								placeholder="Enter your Username" name="username" /> <label
								class="form-label" for="form3Example3">Username</label>
						</div>

						<!-- Password input -->
						<div class="form-outline mb-3">
							<input type="password" id="form3Example4"
								class="form-control form-control-lg"
								placeholder="Enter password" name="password" /> <label
								class="form-label" for="form3Example4">Password</label>
						</div>

						<div class="d-flex justify-content-between align-items-center"></div>



						<div class="text-center text-lg-start mt-4 pt-2">
							<button type="submit" class="btn btn-primary btn-lg"
								style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>



							<p class="small fw-bold mt-2 pt-1 mb-0">
								Don't have an account? <a href="/registrationPage"
									class="link-danger">Register</a>
							</p>



						</div>

					</form>
				</div>
			</div>
		</div>

	</section>
</body>
</html>
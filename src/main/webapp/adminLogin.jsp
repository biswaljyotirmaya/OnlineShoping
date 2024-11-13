<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style>
body {
	height: 100vh;
}
</style>
</head>

<body
	class="d-flex justify-content-center align-items-center bg-dark text-white">
	<form class="p-4 border rounded-3" action="alog" method="post">
		<h2 class="text-center">
			<span class="bi bi-person-fill "></span>Admin login
		</h2>
		<dl>
			<dt>Admin user Name</dt>
			<dd>
				<input type="text" class="form-control" name='aname'
					placeholder="Enter your email">
			</dd>
			<dt>Admin password</dt>
			<dd>
				<input type="password" class="form-control" name='apass'
					placeholder="Enter password">
			</dd>
			<dt class="text-center">
				<button type="submit" value="login" class="btn btn-primary w-100">Login</button>
			</dt>
		</dl>

	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
</body>

</html>

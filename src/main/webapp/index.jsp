<%@page import="java.util.ArrayList"%>
<%@page import="com.jb.model.AdminBean"%>
<%@page import="com.jb.model.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style>
#successModal {
	transition: opacity 0.5s ease-out;
}
</style>
<script>
	document.addEventListener("DOMContentLoaded", function() {
		setTimeout(function() {
			let successModal = document.getElementById("successModal");
			if (successModal) {
				successModal.style.opacity = "0";
				setTimeout(function() {
					successModal.style.display = "none";
				}, 500);
			}
		}, 2000);
	});
</script>
</head>
<body class="bg-dark text-white">
	<header>
		<%@ include file="components/header.jsp"%>
	</header>

	<main>
		<%@ include file="components/successLogin.jsp"%>
		<div class="container mt-3">
			<div class="row">
				<%
				if (products == null || products.isEmpty()) {
				%>
				<div class="col-12 text-center">
					<p>No products found!</p>
				</div>
				<%
				} else {
				int row = 1;
				for (ProductBean product : products) {
				%>
				<div class="col-md-4 mb-3">
					<div class="card">
						<%
						byte[] imageBytes = product.getImage();
						if (imageBytes != null && imageBytes.length > 0) {
							String base64Image = java.util.Base64.getEncoder().encodeToString(imageBytes);
							String mimeType = "image/jpeg";
							mimeType = "image/png";
						%>
						<img src="data:<%=mimeType%>;base64,<%=base64Image%>"
							alt="Product Image" class="card-img-top" height="200" />
						<%
						}
						%>

						<%@ include file="card.jsp"%>

					</div>
				</div>
				<%
				}
				}
				%>
			</div>
		</div>

		<div class="d-flex justify-content-center align-items-center mt-3">
			<a href="addProduct.jsp" class="btn btn-outline-info"
				data-bs-toggle="modal" data-bs-target="#productModal"> Add
				Product <span class="bi-plus-circle-dotted"></span>
			</a>
		</div>
		<%@ include file="addProduct.jsp"%>


	</main>

	<footer> </footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

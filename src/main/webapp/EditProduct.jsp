<!DOCTYPE html>
<%@page import="com.jb.model.ProductBean"%>
<%@page import="com.jb.model.AdminBean"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Product Edit</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>

<body class="bg-dark text-white">
	<%
	AdminBean abean = (AdminBean) session.getAttribute("abean");
	ProductBean product = (ProductBean) request.getAttribute("pbean");
	%>
	<div
		class="container d-flex justify-content-center align-items-center flex-column vh-100">
		<h3 class="mb-4">
			Hello mr.<%=abean.getAfname()%></h3>
		<form action="upd" method="post"
			class="w-50 p-4 border border-2 border-secondary rounded-4">
			<h3 class="text-center mb-4">Edit Product Details</h3>

			<div class="mb-3 row align-items-center">
				<label for="pcode" class="col-sm-4 col-form-label">Product
					Code</label>
				<div class="col-sm-8">
					<input type="text" readonly class="form-control" id="pcode"
						name="pcode" value="<%=product.getPcode()%>">
				</div>
			</div>

			<div class="mb-3 row align-items-center">
				<label for="pname" class="col-sm-4 col-form-label">Product
					Name</label>
				<div class="col-sm-8">
					<input type="text" readonly class="form-control" id="pname"
						name="pname" value="<%=product.getPname()%>">
				</div>
			</div>

			<div class="mb-3 row align-items-center">
				<label for="pcomp" class="col-sm-4 col-form-label">Product
					Company</label>
				<div class="col-sm-8">
					<input type="text" readonly class="form-control" id="pcomp"
						name="pcomp" value="<%=product.getPcomp()%>">
				</div>
			</div>

			<div class="mb-3 row align-items-center">
				<label for="price" class="col-sm-4 col-form-label">Product
					Price</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="price" name="price"
						value="<%=product.getPrice()%>">
				</div>
			</div>

			<div class="mb-3 row align-items-center">
				<label for="pqnt" class="col-sm-4 col-form-label">Product
					Quantity</label>
				<div class="col-sm-8">
					<input type="number" class="form-control" id="pqnt" name="pqnt"
						value="<%=product.getPqnt()%>">
				</div>
			</div>

			<div class="d-flex justify-content-center">
				<button type="submit" class="btn btn-info">Update product</button>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>

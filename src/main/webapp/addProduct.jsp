<div class="modal fade" id="productModal" tabindex="-1" aria-labelledby="productModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="max-width: 500px; width: 100%;">
		<div class="modal-content">
			<div class="modal-header bg-dark">
				<h5 class="modal-title text-center w-100" id="productModalLabel">Add Product</h5>
				<button type="button" class="btn-close text-white" data-bs-dismiss="modal" aria-label="Close"></button>
			</div>
			<div class="modal-body bg-dark">
				<form action="aps" method="post" enctype="multipart/form-data" class="w-100 p-4 border border-2 border-secondary rounded-4">
					<h3 class="text-center mb-4">Product Details</h3>
					<div class="mb-3 row align-items-center">
						<label for="pcode" class="col-sm-4 col-form-label">Product Code</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="pcode" name="pcode">
						</div>
					</div>
					<div class="mb-3 row align-items-center">
						<label for="pname" class="col-sm-4 col-form-label">Product Name</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="pname" name="pname">
						</div>
					</div>
					<div class="mb-3 row align-items-center">
						<label for="pcomp" class="col-sm-4 col-form-label">Product Company</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="pcomp" name="pcomp">
						</div>
					</div>
					<div class="mb-3 row align-items-center">
						<label for="price" class="col-sm-4 col-form-label">Product Price</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="price" name="price">
						</div>
					</div>
					<div class="mb-3 row align-items-center">
						<label for="pqnt" class="col-sm-4 col-form-label">Product Quantity</label>
						<div class="col-sm-8">
							<input type="number" class="form-control" id="pqnt" name="pqnt">
						</div>
					</div>
					<div class="mb-3 row align-items-center">
						<label for="productImage" class="col-sm-4 col-form-label">Image</label>
						<div class="col-sm-8">
							<input type="file" id="productImage" name="productImage" required />
						</div>
					</div>
					<div class="d-flex justify-content-center">
						<button type="submit" class="btn btn-info w-25">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

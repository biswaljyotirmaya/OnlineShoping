<div class="card-body bg-body">
	<h5 class="card-title text-center"><%=product.getPname()%></h5>
	<p class="card-text row">
		<span class='fw-bold col'>PCode</span> <span class=' col'>: <%=product.getPcode()%></span>
	</p>
	<p class="card-text row">
		<span class='fw-bold col'>Brand</span> <span class=' col'>: <%=product.getPcomp()%></span>
	</p>
	<p class="card-text row">
		<span class='fw-bold col'>Quantity</span> <span class=' col'>:
			<%=product.getPqnt()%></span>
	</p>
	<div class="row">
		<a href='edit?pcode=<%=product.getPcode()%>'
			class="col btn btn-dark w-50 m-1">Edit</a> <a
			href='delete?pcode=<%=product.getPcode()%>'
			class="col btn btn-secondary w-50 m-1">Delete</a>
	</div>
</div>
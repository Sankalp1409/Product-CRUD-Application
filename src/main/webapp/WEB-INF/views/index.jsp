<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Product Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Product Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="p">
							<tr>
								<th scope="row">${p.id}</th>
								<td>${p.name }</td>
								<td>${p.description}</td>
								<td class="font-weight-bold">&#8377; ${p.price}</td>
								<td><a href="delete-product/${p.id}"><i
										class="fa-solid fa-trash-can text-danger"></i></a> <a
									href="update/${p.id}"><i
										class="fa-solid fa-pen-nib text-primary"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="addProduct" class="btn btn-outline-success">Add
						product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
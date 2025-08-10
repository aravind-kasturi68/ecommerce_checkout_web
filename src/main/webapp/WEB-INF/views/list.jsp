<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Product List</title></head>
<body>
<h2>Product List</h2>

<a href="${pageContext.request.contextPath}/products/new">Add New Product</a>
<br><br>

<table border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Price</th><th>Actions</th>
    </tr>
    <c:forEach var="p" items="${products}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>
                <a href="${pageContext.request.contextPath}/products/edit/${p.id}">Edit</a> |
                <a href="${pageContext.request.contextPath}/products/delete/${p.id}">Delete</a> |
                <a href="${pageContext.request.contextPath}/products/details/${p.id}">Details</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

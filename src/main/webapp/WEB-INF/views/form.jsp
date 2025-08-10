<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Product Form</title></head>
<body>
<h2>${product.id == 0 ? "Add Product" : "Edit Product"}</h2>

<form action="${pageContext.request.contextPath}/products" method="post">
    <input type="hidden" name="id" value="${product.id}"/>

    Name: <input type="text" name="name" value="${product.name}" required/><br><br>
    Price: <input type="number" name="price" step="0.01" value="${product.price}" required/><br><br>

    <input type="submit" value="Save"/>
</form>

<a href="${pageContext.request.contextPath}/products">Back to List</a>
</body>
</html>

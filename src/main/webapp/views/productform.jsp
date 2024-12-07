<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html >
<head>
    <title>Product Form</title>
</head>
<body>
    <h1>Product Form</h1>
    <form action="/addProduct" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" /><br/>

        <label for="description">Description:</label>
        <input type="text" id="description" name="description" /><br/>

        <label for="price">Price:</label>
        <input type="text" id="price" name="price" /><br/>

        <label for="quantity">Quantity:</label>
        <input type="text" id="quantity" name="quantity" /><br/>

        <button type="submit">Save</button>
    </form>
</body>
</html>

</html>
<%--
  Created by IntelliJ IDEA.
  User: himedere
  Date: 26/04/2018
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Product Discount Calculator</title>
<style type="text/css">
    .calculator {
        height: 480px;
        width: 600px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }

    .login input {
        padding: 5px;
        margin: 5px
    }
</style>
<body>
<form method="post" action="/display-discount">
    <div class="calculator">
        <h2>Product Discount Calculator</h2>
        <input type="text" name="Product Description" size="30" placeholder="Product Description"/>
        <input type="number" name="List Price" size="30" placeholder="List Price"/>
        <input type="number" name="Discount Percent" size="30" placeholder="Discount Percent"/>
        <input type="submit" value="Submit"/>
    </div>
</form>

</body>
</html>

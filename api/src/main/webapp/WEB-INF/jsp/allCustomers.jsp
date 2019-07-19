<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Food Order System</title>
</head>

<body>
<h2>All Customers</h2>

    <c:forEach items="${customers}" var="customer">
        <p>
                ${customer}
        </p>
    </c:forEach>

<table>

</table>


</body>
</html>

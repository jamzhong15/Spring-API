<%--
  Created by IntelliJ IDEA.
  User: jameszhong
  Date: 2019-07-19
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Customers</title>

    <c:forEach items="${customers}" var="customer">
        <p>
                ${customer.name}
        </p>
    </c:forEach>

</head>
<body>

</body>
</html>

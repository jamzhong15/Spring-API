<%--
  Created by IntelliJ IDEA.
  User: jameszhong
  Date: 2019-07-19
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
    <c:forEach items="${customers}" var="customer">
        <p>
                ${customer.name}
        </p>
    </c:forEach>
</head>
<body>

</body>
</html>

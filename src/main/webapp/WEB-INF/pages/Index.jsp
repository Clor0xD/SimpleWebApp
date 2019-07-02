<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.07.2019
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Web App</title>
</head>
<body>
<h2>Index</h2>
<div>Current Date: ${systemProperty.currentDate} </div>
<div>PCName: ${systemProperty.pcName} </div>
<div>Free Memory: ${systemProperty.javaFreeMemory} mb </div>
<div>Total Memory: ${systemProperty.javaTotalMemory} mb </div>
</body>
</html>

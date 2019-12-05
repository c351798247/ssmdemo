<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="<%=application.getContextPath()%>/js/jquery-3.4.1.js"></script>
</head>
<body>
<h2>Hello World!</h2>
<form method="get" action="<%=application.getContextPath()%>/hello">
    <input type="text" name="dd"/>
    <input type="submit" value="ClickMe"/>
</form>
<script type="text/javascript">
    $(function () {
        console.log(22);
    })
</script>
</body>
</html>

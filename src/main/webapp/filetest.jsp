<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传下载</title>
</head>
<body>
<div>
    <form action="/file/upload" method="post" enctype="multipart/form-data">
        请选择上传的文件:<input type="file" name="file"/><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>

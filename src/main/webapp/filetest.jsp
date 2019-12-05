<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>文件上传下载</title>
    <script type="text/javascript" src="<%=application.getContextPath()%>/js/jquery-3.4.1.js"></script>

</head>
<body>
<div>
    <form action="<%=application.getContextPath()%>/file/upload" method="post" enctype="multipart/form-data">
        请选择上传的文件:<input type="file" id="file" name="file"/><br>
    </form>
    <button id="btn" onsubmit="return false">上传</button>
</div>
<div>
    <ul>
        <c:forEach items="${files}" var="f">
            <li><a href="<%=application.getContextPath()%>/file/download/${f.toString().substring(81)}">${f}</a></li>
        </c:forEach>
    </ul>
</div>
<script type="text/javascript">
    $('#btn').click(function () {
        var form = new FormData();
        form.append("file",$('#file').get(0).files[0]);
        $.ajax({
            data:form,
            type: 'post',
            url: '<%=application.getContextPath()%>/file/upload',
            processData:false,  //tell jQuery not to process the data
            contentType: false,
//            contentType: 'multipart/form-data',
            success: function (data) {
                alert(data);
            },error: function (data) {
                alert(data)
            }
        });
    })
</script>
</body>
</html>

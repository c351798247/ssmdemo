<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
  <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
</head>
<body>
<h2>welcome Second</h2>
<form action="/user" method="post">
  <input name="userId" type="text"/>
  <input name="uname" type="text"/>
  <input name="upass" type="password"/>
  <input value="submit" type="submit"/>
</form>
<button id="btn">Ajax</button>
<a href="${s:mvcUrl('HC#out').arg(0,'22').build()}">mvcUrl</a>
<script type="text/javascript">
  $(function () {
    $('#btn').click(function () {
      var dd={
        userId: $('input[name=userId]').val(),
//                uname: $('input[name=uname]').val(),
        upass: $('input[name=upass]').val()
      };
      $.ajax({
        type: 'post',
        dataType: 'json',
        url: '/user2',
        contentType: 'application/json',
        data: JSON.stringify(dd),
        success: function (data) {
          console.log(data);
        }
      });
    })
  })
</script>
</body>
</html>

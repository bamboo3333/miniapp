<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/6/8
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../js/jquery-3.3.1.min.js" type="text/javascript"></script>

</head>
<body>
    <a id="data" href="${pageContext.request.contextPath}/data.action"></a>

    <script>
        $(function () {
            document.getElementById("data").click();
            $("#data").click();
        })
    </script>
</body>
</html>

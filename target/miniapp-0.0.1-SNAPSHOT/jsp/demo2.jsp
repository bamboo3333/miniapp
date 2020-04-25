<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/3/24
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取查询数据，显示到页面上</title>
</head>
<body>
    <form action="${ pageContext.request.contextPath }/news/info.action" method="post">
        查询条件：NULl
        <table width="100%" border=1>
            <tr>
                <td><input type="submit" value="查询"/></td>
            </tr>
        </table>
        商品列表：
        <table width="100%" border=1>
            <tr>
                <td>招聘主题</td>
                <td>招聘方</td>
                <td>公司描述</td>
                <td>操作</td>
            </tr>
            <tr>
                <td>${news.title }</td>
                <td>${news.publisher }</td>
                <td>${news.content}</td>
                <td><a href="#">修改</a></td>
            </tr>
        </table>

    </form>
</body>
</html>

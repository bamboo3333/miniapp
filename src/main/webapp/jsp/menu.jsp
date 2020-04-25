<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/2
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.4.1/dist/jquery.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <style>
        body{
            background-color: black;
        }
        .navbar-dark .navbar-nav{
            text-align: center;
            float: none;
        }
        .navbar-dark .navbar-nav li{
            display: inline-block;
            float: none;
        }
        p{
            color: #a6e1ec;
        }
        .right{
            position: relative;
            font-size: medium;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="${ pageContext.request.contextPath }/jsp/menu.jsp"><p>Offer直通车后台管理</p></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown" style="text-align: center">
            <ul class="nav navbar-nav mr-auto">
                <li class="nav-item dropdown active">
                    <a class="nav-link dropdown-toggle" href="#" id="newsDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        信息更改
                    </a>
                    <div class="dropdown-menu" aria-labelledby="newsDropdownMenuLink">
                        <a class="dropdown-item" href="${ pageContext.request.contextPath }/jsp/news/addNews.jsp">新增信息</a>
                        <a class="dropdown-item" href="${ pageContext.request.contextPath }/news/info.action">查看信息</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">待添加</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">待添加</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link right" style="color: white;left: 800px;">当前用户:
                        <%if(null!=session.getAttribute("usersession")){%>
                        ${sessionScope.usersession}
                        <%}else {%>
                        <font size="2px" color="red">请登录</font>
                        <%}%>
                    </a>

                </li>
                <li class="nav-item">
                    <%if (null!=session.getAttribute("usersession")){%>
                   <a class="nav-link right" style="color: yellow;left: 820px;" href="/admin/logout.action">登出</a>
                    <%}else{%>
                    <a class="nav-link right" style="color: #a6e1ec;left: 820px;" href="/admin/login.action">登入</a>
                    <%}%>
                </li>
            </ul>
        </div>
    </nav>
</body>
</html>

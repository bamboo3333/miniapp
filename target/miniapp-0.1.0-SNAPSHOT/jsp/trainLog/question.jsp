<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/30
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>笔试记录</title>
    <style>
        .button-a{
            color: white;
        }
        body{
            background-color: #343A40;
        }
        h3{
            color: white;
            text-align: center;
        }
        .userNum{
            color: white;
            text-align: center;
        }
        .img1{
            width: 40px;
            height: 40px;
        }
    </style>
</head>
<body>

<h3>笔试记录</h3>
<br>
<table class="table table-hover table-dark table-striped" id="assessStage" data-height="467" data-mobile-responsive="true" style="table-layout: fixed;">
    <thead class="thead-dark w-100 ">
    <tr class="row mx-0">
        <th class="col-2">序号</th>
        <th class="col-2">用户</th>ID
        <th class="col-2">题目描述</th>
        <th class="col-2">##</th>
        <th class="col-2">##</th>
        <th class="col-2">操作</th>
    </tr>
    </thead>
    <tbody class="w-100">

    <c:forEach items="${ questions }" var="question">
        <tr class="row mx-0">
            <th class="col-2">${question.id}</th>
            <td class="col-2">${question.userId}</td>
            <td class="col-2">${question.titleDesc}</td>
            <td class="col-2">${question.titleIead}</td>
            <td class="col-2">${question.finishTime}</td>
            <td class="col-2 text-center">
                <button type="button" class="btn btn-secondary"><a  class="button-a" href="#">详情</a></button>
                <button type="button" class="btn btn-primary"><a  class="button-a" href="#">修改</a></button>
                <button type="button" class="btn btn-danger"><a  class="button-a" href="#">删除</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>


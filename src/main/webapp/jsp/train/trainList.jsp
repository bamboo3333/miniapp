<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/29
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>笔试训练题
    </title>
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
        .trainNum{
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

<h3>用户信息列表</h3>
<h6 class="trainNum">目前题目总数:   <font color="red">${ trainNum }</font></h6>
<br>
<table class="table table-hover table-dark table-striped" id="assessStage" data-height="467" data-mobile-responsive="true" style="table-layout: fixed;">
    <thead class="thead-dark w-100 ">
    <tr class="row mx-0">
        <th class="col-2">序号</th>
        <th class="col-2">标识</th>
        <th class="col-2">类型</th>
        <th class="col-2">题目</th>
        <th class="col-2">限制</th>
        <th class="col-2">操作</th>
    </tr>
    </thead>
    <tbody class="w-100">

    <c:forEach items="${ trainsList }" var="train">
        <tr class="row mx-0">
            <th class="col-2">${train.id}</th>
            <td class="col-2"><img src="${train.titleImg}" class="img1"></td>
            <td class="col-2">${train.titleType}</td>
            <td class="col-2">${train.titleName}</td>
            <td class="col-2">${train.titleRemark}</td>
            <td class="col-2 text-center">
                <button type="button" class="btn btn-secondary"><a  class="button-a" href="${pageContext.request.contextPath}/train/trainDetails.action?id=${train.id}">详情</a></button>
                <button type="button" class="btn btn-primary"><a  class="button-a" href="${pageContext.request.contextPath}/train/trainModifyView.action?id=${train.id}">修改</a></button>
                <button type="button" class="btn btn-danger"><a  class="button-a" href="${pageContext.request.contextPath}/train/trainDelete.action?id=${train.id}">删除</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>


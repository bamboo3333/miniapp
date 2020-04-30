<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/29
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>用户信息</title>
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
        .text-center{

        }
    </style>
</head>
<body>

<h3>简历列表</h3>
<%--<h6 class="userNum">目前用户总数:   <font color="red">${ userNum }</font></h6>--%>
<br>
<table class="table table-hover table-dark table-striped" id="assessStage" data-height="467" data-mobile-responsive="true" style="table-layout: fixed;">
    <thead class="thead-dark w-100 ">
    <tr class="row mx-0">
        <th class="col-2">序号</th>
        <th class="col-2">简历类型</th>
        <th class="col-2">适合人群</th>
        <th class="col-3">模板地址</th>
        <th class="col-3 ">操作</th>
    </tr>
    </thead>
    <tbody class="w-100">

    <c:forEach items="${ resumeList }" var="resume">
        <tr class="row mx-0">
            <th class="col-2">${resume.id}</th>
            <td class="col-2">${resume.resumeType}</td>
            <td class="col-2">${resume.fitCrowd}</td>
            <td class="col-3">${resume.modelUrl}</td>
            <td class="col-3 text-center">
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

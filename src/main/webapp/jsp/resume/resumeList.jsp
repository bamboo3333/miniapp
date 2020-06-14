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
    <script>
        window.onload = function () {
            var types = document.getElementsByClassName("type");
            for (j=0,length=types.length;j<length;j++){
                if (types[j].innerHTML==0){
                    types[j].innerHTML="实习生";
                }else if(types[j].innerHTML==1){
                    types[j].innerHTML="全职生";
                }else {
                    types[j].innerHTML="招聘生";
                }
            }
        };

    </script>
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
        .text-center{

        }
        .img1{
            width: 40px;
            height: 40px;
        }
        .resumeNum{
            color: white;
            text-align: center;
        }
    </style>
</head>
<body>

<h3>简历列表</h3>
<h6 class="resumeNum">目前模板总数:   <font color="red">${ resumeNum }</font></h6>
<br>
<table class="table table-hover table-dark table-striped" id="assessStage" data-height="467" data-mobile-responsive="true" style="table-layout: fixed;">
    <thead class="thead-dark w-100 ">
    <tr class="row mx-0">
        <th class="col-1 text-center">序号</th>
        <th class="col-1 text-center">简历类型</th>
        <th class="col-1 text-center">适合人群</th>
        <th class="col-4 text-center">模板地址</th>
        <th class="col-2 text-center">模板样图</th>
        <th class="col-3 text-center">操作</th>
    </tr>
    </thead>
    <tbody class="w-100">

    <c:forEach items="${ resumeList }" var="resume">
        <tr class="row mx-0">
            <th class="col-1 text-center">${resume.id}</th>
            <td class="col-1 text-center">${resume.resumeType}</td>
            <td class="col-1 type text-center">${resume.fitCrowd}</td>
            <td class="col-4 text-center">${resume.modelUrl}</td>
            <td class="col-2 text-center"><img src="${resume.modelImg}" class="img1"></td>
            <td class="col-3 text-center">
                <button type="button" class="btn btn-primary"><a  class="button-a" href="${pageContext.request.contextPath}/resume/resumeModifyView.action?id=${resume.id}">修改</a></button>
                <button type="button" class="btn btn-danger"><a  class="button-a" href="${pageContext.request.contextPath}/resume/resumeDelete.action?id=${resume.id}">删除</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>

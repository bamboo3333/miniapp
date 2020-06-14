<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.mini.miniapp.pojo.News" %><%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/4
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>List</title>
    <script>
        window.onload = function () {
            var types = document.getElementsByClassName("type");
            for (var j=0,length=types.length;j<length;j++){
                if (types[j].innerHTML==0){
                    types[j].innerHTML="实习生";
                }else if(types[j].innerHTML==1){
                    types[j].innerHTML="全职生";
                }else {
                    types[j].innerHTML="招聘生";
                }
            }
            var info = document.getElementsByClassName("info");
            for (var k=0,len=info.length;k<len;k++){
                console.log(info[k].innerHTML);
                if(info[k].innerHTML==1){
                    info[k].innerHTML="(今日招聘)";
                    info[k].style.color="#09F797"
                }else if(info[k].innerHTML==2){
                    info[k].innerHTML="(热门推荐)";
                }else {
                    info[k].innerHTML="";
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
        .newsNum{
            color: white;
            text-align: center;
        }
        .info{
            font-size: 12px;
            color: red;
        }
    </style>
</head>
<body>
<h3>招聘信息列表</h3>
<h6 class="newsNum">目前信息总数:   <font color="red">${ newsNum }</font></h6>
<br>
<table class="table table-hover table-dark table-striped" id="assessStage" data-height="467" data-mobile-responsive="true" style="table-layout: fixed;">
    <thead class="thead-dark w-100 ">
    <tr class="row mx-0">
        <th class="col-3">序号</th>
        <th class="col-3">招聘对象</th>
        <th class="col-3">发布公司</th>
        <th class="col-3">操作</th>
    </tr>
    </thead>
    <tbody class="w-100">

    <c:forEach items="${ newsList }" var="news">
        <tr class="row mx-0">
            <th class="col-3">${news.id}</th>
            <td class="type col-3">${news.typeId}</td>
            <td class="col-3">${news.publisher}<span  class="info">${news.todayNews}</span></td>
            <td class="col-3 text-center">
                <button type="button" class="btn btn-secondary"><a  class="button-a" href="${pageContext.request.contextPath}/news/newsDetails.action?id=${news.id}">详情</a></button>
                <button type="button" class="btn btn-primary"><a  class="button-a" href="${pageContext.request.contextPath}/news/newsModifyView.action?id=${news.id}">修改</a></button>
                <button type="button" class="btn btn-danger"><a  class="button-a" href="${pageContext.request.contextPath}/news/newsDelete.action?id=${news.id}">删除</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script>
    $(".info")
</script>
</body>
</html>

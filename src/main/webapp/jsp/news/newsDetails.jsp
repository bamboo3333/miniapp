<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/9
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>Title</title>

    <style>
        .table{
            margin-top: 10px;
        }
        span{
            margin-left: 20px;
        }
        body{
            background-color: black;
        }
        .btn{
            position: relative;
            top:180px;
            left: 1425px;
        }
    </style>
</head>
<body>
<div class="spinner-grow text-secondary" role="status">
    <span class="sr-only">Loading...</span>
</div>
<table class="table table-dark">
    <thead>
    <tr>
        <th class="col-lg-1 text-center"><h2>招聘信息详情</h2></th>

    </tr>
    </thead>
    <tbody>
    <tr>
        <td class="text-center">${ newsDetails.title}</td>
    </tr>
    <tr>
        <td class="text-center">${ newsDetails.publisher}</td>

    </tr>
    <tr>
        <td class="text-center">
            ${ newsDetails.type}
        </td>
    </tr>
    <tr>
        <td class="text-center">
            ${ newsDetails.desc}
        </td>
    </tr>
    <tr>
        <td class="text-center">
            ${ newsDetails.workType}
        </td>
    </tr>
    <tr>
        <td class="text-center">
            ${ newsDetails.jobDesc}
        </td>
    </tr>
    <tr>
        <td class="text-center">
            ${ newsDetails.jobReq}
        </td>
    </tr>
    <tr>
        <td class="text-center">
            ${ newsDetails.companyDesc}
        </td>
    </tr>
    </tbody>
</table>
<button  type="button" class="btn btn-primary"><a href="${pageContext.request.contextPath}/news/info.action" class="badge badge-primary">返回</a></button>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/6/14
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
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
            top:160px;
            left: 1300px;
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
        <th class="col-lg-1 text-center"><h2>训练题详情</h2></th>

    </tr>
    </thead>
    <tbody>
    <tr>
        <td class="text-center">${ trainDetails.titleType}</td>
    </tr>
    <tr>
        <td class="text-center">${ trainDetails.titleName}</td>

    </tr>
    <tr>
        <td class="text-center">
            ${ trainDetails.titleDesc}
        </td>
    </tr>
    <tr>
        <td class="text-center">
            ${ trainDetails.titleExp}
        </td>
    </tr>
    <tr>
        <td class="text-center">
            ${ trainDetails.titleRemark}
        </td>
    </tr>

    </tbody>
</table>
<button  type="button" class="btn btn-primary"><a href="${pageContext.request.contextPath}/train/info.action" class="badge badge-primary">返回</a></button>
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/9
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>modify</title>
    <style>
        @media (min-width: 992px) {
            .modal-lg {
                width: 1100px;
            }
        }
        form{
            margin-top: 10px;
        }
    </style>

</head>
<body>
<form method="post" action="/news/newsModify.action">
    <input type="hidden" name="id" value="${newsModify.id}">
    <div class="modal-dialog modal-lg">
        <div class="modal-content"  id="modal_content">
            <div class="modal-header">
                <h4 class="modal-title text-center" id="myModalLabel">信息修改</h4>
            </div>
            <div class="modal-body" id = "model-body">
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">类型</label>
                    <select class="form-control" id="typeIdSelect" name="typeId">
                        <option value="0">实习生</option>
                        <option value="1">全职生</option>
                        <option value="2">招聘生</option>
                    </select>
                </div>
                <div class="form-group" style="text-align: center">
                    <label>标题</label>
                    <input type="text" name="title" class="form-control"placeholder="信息标题" autocomplete="off" value="${newsModify.title}">
                </div>
                <div class="form-group" style="text-align: center">
                    <label >发布者</label>
                    <input type="text" name="publisher" class="form-control" placeholder="发布者" autocomplete="off" value="${newsModify.publisher}">
                </div>
                <div class="form-group" style="text-align: center">
                    <label >内容网址</label>
                    <input type="text" name="contentUrl" class="form-control"placeholder="内容网址" autocomplete="off" value="${newsModify.contentUrl}">
                </div>
                <div class="form-group" style="text-align: center">
                    <label >公司logo</label>
<%--                    <textarea class="form-control" rows="3" autocomplete="off" style="resize: none" name="content">${newsModify.coverImg}</textarea>--%>
                    <input type="text" name="coverImg" class="form-control" placeholder="logo网址" autocomplete="off" value="${newsModify.coverImg}">
                </div>
            </div>
            <div class="modal-footer">
                <div class="form-group">
                    <button type="submit" class="btn btn-primary form-control" style="width: 80px">修改</button>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</form>
</body>
<script>
    window.onload=function () {
        $("#typeIdSelect option[ value='${ newsModify.typeId}']").attr("selected", true);
    }
</script>
</html>


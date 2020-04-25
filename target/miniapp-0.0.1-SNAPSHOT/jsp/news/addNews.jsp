<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/4/2
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>add</title>
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
<form method="post" action="${ pageContext.request.contextPath }/news/save.action" target="_self">
    <div class="modal-dialog modal-lg">
        <div class="modal-content"  id="modal_content">
            <div class="modal-header">
                <h4 class="modal-title text-center" id="myModalLabel">新增招聘</h4>
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
                    <label for="typeIdSelect">标题</label>
                    <input type="text" name="title" class="form-control"placeholder="信息标题" autocomplete="off">
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">发布者</label>
                    <input type="text" name="publisher" class="form-control" placeholder="发布者" autocomplete="off">
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">公司logo</label>
                    <input type="text" name="coverImg" class="form-control"placeholder="logo链接" autocomplete="off">
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">内容内联</label>
                    <input type="text" name="contentUrl" class="form-control" placeholder="内容-公众号" autocomplete="off"  >
                </div>
            </div>
            <div class="modal-footer">
                <div class="form-group">
                    <button type="submit" class="btn btn-primary form-control" style="width: 80px">添加</button>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</form>
</body>

</html>

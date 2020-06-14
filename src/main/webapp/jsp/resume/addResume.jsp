<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/6/14
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../menu.jsp"></jsp:include>
<html>
<head>
    <title>modify</title>
    <script src="/js/jquery-3.3.1.min.js"></script>
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
<form method="post" action="/resume/resumesave.action">
    <input type="hidden" name="id" value="${resumeModify.id}">
    <div class="modal-dialog modal-lg">
        <div class="modal-content"  id="modal_content">
            <div class="modal-header">
                <h4 class="modal-title text-center" id="myModalLabel">信息修改</h4>
            </div>
            <div class="modal-body" id = "model-body">
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">使用人群</label>
                    <select class="form-control" id="typeIdSelect" name="fitCrowd" >
                        <option value="0">实习生</option>
                        <option value="1">全职生</option>
                        <option value="2">招聘生</option>
                    </select>
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">简历类型</label>
                    <input type="text" name="resumeType" class="form-control"placeholder="简历类型" autocomplete="off" >
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">样图链接</label>
                    <input type="text" name="modelImg" class="form-control" placeholder="样图链接" autocomplete="off">
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">下载链接</label>
                    <input type="text" name="modelUrl" class="form-control"placeholder="下载链接" autocomplete="off">
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



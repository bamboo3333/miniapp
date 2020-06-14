<%--
  Created by IntelliJ IDEA.
  User: GuanPa
  Date: 2020/6/14
  Time: 10:53
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
<form method="post" action="/train/save.action">
    <input type="hidden" name="titleId" value="1">
    <div class="modal-dialog modal-lg">
        <div class="modal-content"  id="modal_content">
            <div class="modal-header">
                <h4 class="modal-title text-center" id="myModalLabel">题目添加</h4>
            </div>
            <div class="modal-body" id = "model-body">

                <div class="form-group" style="text-align: center">
                    <label >题目</label>
                    <input type="text" name="titleName" class="form-control"placeholder="标题" autocomplete="off" value="">
                </div>
                <div class="form-group" style="text-align: center">
                    <label >类型</label>
                    <input type="text" name="titleType" class="form-control" placeholder="题目类型" autocomplete="off" >
                </div>
                <div class="form-group" style="text-align: center">
                    <label >题目封图</label>
                    <input type="text" name="titleImg" class="form-control"placeholder="题目封图" autocomplete="off">
                </div>
                <div class="form-group" style="text-align: center">
                    <label >题目描述</label>
                    <textarea name="titleDesc" class="form-control" placeholder="题目描述" autocomplete="off"  ></textarea>
                </div>
                <div class="form-group" style="text-align: center">
                    <label >输入示例</label>
                    <textarea name="titleExp" class="form-control" placeholder="输入示例" autocomplete="off"></textarea>
                </div>
                <div class="form-group" style="text-align: center">
                    <label >题目限制</label>
                    <textarea name="titleRemark" class="form-control" placeholder="题目限制" autocomplete="off" ></textarea>
                </div>
                <div class="form-group" style="text-align: center">
                    <label >时间要求</label>
                    <input type="text" name="titleTime" class="form-control" placeholder="时间要求" autocomplete="off" value="">
                </div>
                <div class="form-group" style="text-align: center">
                    <label >题目链接</label>
                    <input type="text" name="titleUrl" class="form-control" placeholder="题目链接" autocomplete="off">
                </div>

            </div>
            <div class="modal-footer">
                <div class="form-group">
                    <button type="submit" class="btn btn-primary form-control" style="width: 80px">添加</button>
                </div>
            </div>
            <input name="type" hidden="hidden" id="type">
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</form>
</body>
</html>



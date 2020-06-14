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
                    <label for="typeIdSelect">标题</label>
                    <input type="text" name="title" class="form-control"placeholder="信息标题" autocomplete="off" value="${ newsModify.title }">
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">发布者</label>
                    <input type="text" name="publisher" class="form-control" placeholder="发布者" autocomplete="off" value="${ newsModify.publisher }">
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeSelect">特殊指定</label>
                    <select class="form-control" id="typeSelect" name="typeId">
                        <option value="0">不指定</option>
                        <option value="1">今日校招</option>
                        <option value="2">热门推荐</option>
                    </select>

                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">公司logo</label>
                    <input type="text" name="coverImg" class="form-control"placeholder="logo链接" autocomplete="off" value="${ newsModify.coverImg}">
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">技术需求</label>
                    <input type="text" name="desc" class="form-control" placeholder="技术要求简单描述" autocomplete="off" value="${ newsModify.desc }" >
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">工作简介</label>
                    <input type="text" name="workType" class="form-control" placeholder="工作安排简介" autocomplete="off" value="${ newsModify.workType }" >
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">工作简要描述</label>
                    <textarea name="jobDesc" class="form-control" placeholder="工作内容描述" autocomplete="off" >${ newsModify.jobDesc }</textarea>
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">招聘要求</label>
                    <textarea name="jobReq" class="form-control" placeholder="应聘者满足的条件" autocomplete="off">${ newsModify.jobReq}</textarea>
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">公司简介</label>
                    <textarea name="companyDesc" class="form-control" placeholder="公司简介" autocomplete="off">${ newsModify.companyDesc }</textarea>
                </div>
                <div class="form-group" style="text-align: center">
                    <label for="typeIdSelect">联系我们</label>
                    <textarea name="contact" class="form-control" placeholder="联系我们" autocomplete="off">${ newsModify.contact }</textarea>
                </div>

            </div>
            <div class="modal-footer">
                <div class="form-group">
                    <button type="submit" onclick="getType()" class="btn btn-primary form-control" style="width: 80px">修改</button>
                </div>
            </div>
            <input name="type" hidden="hidden" id="type">
            <input name="todayNews" hidden="hidden" id="todayNews">
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</form>
</body>
<script>
    window.onload=function () {
        $("#typeIdSelect option[ value='${ newsModify.typeId}']").attr("selected", true);
    };
    function getType() {
        //获取select选中的值
        var jobType = $("#typeIdSelect option:selected").val();
        var todayNews = $("#typeSelect option:selected").val();
        var type = "";
        if (jobType==0){
            type = "实习生";
        }else if (jobType==1){
            type = "全职生";
        }else {
            type = "招聘生";
        }
        console.log(todayNews);
        //设置隐藏的type标签的value
        $("#type").val(type);
        $("#todayNews").val(todayNews);
    }
</script>
</html>


<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/4/22
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--   bootstrap美化界面--%>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <title></title>
</head>
<body>
<div class="container">
    <%--    row clearfix清除浮动--%>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label>书籍名称:</label>
                <input type="text"  name="bookName" class="form-control"required >
            </div>
            <div class="form-group">
                <label >书籍数量:</label>
                <input type="text" name="bookCounts" class="form-control" required >
            </div>
            <div class="form-group">
                <label >书籍描述:</label>
                <input type="text" name="detail" class="form-control" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control"  value="添加" >
            </div>
        </form>
</div>
</body>
</html>

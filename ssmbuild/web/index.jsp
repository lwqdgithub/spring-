<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/4/20
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style type="text/css">
       h3{
         width: 180px;
         height: 38px;
         /*设置上面的距离 和居中*/
         margin:300px auto ;
         text-align: center;
         line-height: 38px;
         background-color: darkcyan;
         border-radius: 5px;
       }
      a{
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>

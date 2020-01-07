<%--
  Created by IntelliJ IDEA.
  User: YSilhouette
  Date: 2020/1/6
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/user/login" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input name="name" type="text"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登录"/>
            </td>
        </tr>
    </table>
    ${messageError}
</form>
</body>
</html>

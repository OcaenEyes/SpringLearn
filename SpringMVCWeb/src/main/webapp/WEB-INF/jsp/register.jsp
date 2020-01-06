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
    <title>注册</title>
</head>
<body>
<form action="/user/register" method="post" name="registForm">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="name" value="${name}"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" maxlength="20"/></td>
        </tr>
        <tr>
            <td>确认密码</td>
            <td><input type="password" name="repassword" maxlength="20"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="注册"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>

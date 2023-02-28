<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.ecut.Dao.LoginDao" %>
<%@ page import="org.ecut.Dao.UserEntity" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入处理</title>
</head>
<body>
<%
//获取表单提交到服务器的用户名
String usrname=request.getParameter("usrname");
//获取表单提交到服务器的密码
String pwd=request.getParameter("pwd1");
LoginDao l = new LoginDao();
//初始化UserEntity类对象，并把从表单中获取到的用户名和密码赋给user(调用的是UserEntity类中带参数的构造函数)，
UserEntity user = new UserEntity(usrname,pwd);
//调用LoginDao.java的login方法
if(l.login(user)==1){
	session.setAttribute("usrname", usrname);
	response.sendRedirect("home.html");
}
else{
	 out.print("<script type='text/javascript'>alert('用户名或密码错误,登陆失败!');window.location.href='login.html';</script>");
	 //out.print("<meta http-equiv='refresh' content='0; url=login.html'> ");
}
%>
</body>
</html>
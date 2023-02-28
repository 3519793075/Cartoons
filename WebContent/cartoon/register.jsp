<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import ="java.sql.*,java.util.*,org.ecut.Dao.Student,org.ecut.Dao.Register"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	//1.加载驱动类
	//Class.forName("com.mysql.jdbc.Driver");
	//2.与数据库建立链接
	//final String URL="jdbc:mysql://localhost:3306/test";
	//final String USERNAME="root";
	//final String PWD="123456";
	//Connection conn=DriverManager.getConnection(URL,USERNAME,PWD);
	//3.创建preparedStatement对象
	//String sql="select * from student where name=? and pwd=?";
	//PreparedStatement pstmt=conn.prepareStatement(sql);
	//String uname=request.getParameter("name");
	//String upwd=request.getParameter("pwd");
	//pstmt.setString(1,uname);
	//pstmt.setString(2,upwd);
	//ResultSet rs=pstmt.executeQuery();
	//if(rs.next())
	//	out.print("登录成功");
	//else
	//	out.print("登录失败");
	
	String uname=request.getParameter("name");//收到HTML液面传递过来的name值
	String upwd=request.getParameter("pwd");//收到pwd值
	Student stu=new Student();
	stu.setName(uname);
	stu.setPwd(upwd);
	Register reg = new Register();
	boolean flag=false;
	flag=reg.register(stu);
	if(flag){
		out.println("注册成功！");
	}
	else
		out.println("注册失败，已经存在该用户！");
	
%>
</body>
</html>

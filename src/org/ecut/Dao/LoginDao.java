package org.ecut.Dao;
import java.sql.*;
public class LoginDao {
//注册成功返回1，不成功返回0
public int login(UserEntity user) throws SQLException, ClassNotFoundException {
	final String URL="jdbc:mysql://localhost:3306/test";//test是创建的数据库名
	final String USERNAME="root";
	final String PWD="123456";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection(URL,USERNAME,PWD);
	
	//创建preparedStatement对象
	//sql的功能是查找指定的用户名及密码
	String sql="select * from student where name=? and pwd=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	//给上面问号处赋值
	pstmt.setString(1, user.getUsrname());
	pstmt.setString(2, user.getPwd());
	//执行sql语句，结果保存在rs中
	ResultSet rs=pstmt.executeQuery();
	//rs.next()表示rs中有没有内容，也就是上面sql有没有查询到结果
	if(rs.next()) {
		if(pstmt!=null)
			pstmt.close();
		if(conn!=null)
			conn.close();
		return 1;
	}
	else {
		if(pstmt!=null)
			pstmt.close();
		if(conn!=null)
			conn.close();
		return 1;
	}
}
}
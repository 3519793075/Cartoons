package org.ecut.Dao;

import java.sql.*;
import java.util.*;

public class Register {
	public boolean register(Student stu) throws SQLException, ClassNotFoundException {
		//1.����������
		Class.forName("com.mysql.jdbc.Driver");
		//2.�����ݿ⽨������
		final String URL="jdbc:mysql://localhost:3306/test";
		final String USERNAME="root";
		final String PWD="123456";
		Connection conn=DriverManager.getConnection(URL,USERNAME,PWD);
		//�����ݿ��������
		String uname = stu.getName();//��ȡstu���ݵĲ���
		String upwd = stu.getPwd();
		String sql1="select * from student where name=?";//
		PreparedStatement pstmt1=conn.prepareStatement(sql1);
		pstmt1.setString(1,uname);
		ResultSet rs=pstmt1.executeQuery();
		if(rs.next()) {
			return false;}
		else {
			String sql="insert into student values(?,?);";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,uname);//���ʺ����Ϊ����
			pstmt.setString(2,upwd);
			pstmt.executeUpdate();//ִ��������sql���
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			return true;
		}
		
		
	}

}

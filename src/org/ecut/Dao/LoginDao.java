package org.ecut.Dao;
import java.sql.*;
public class LoginDao {
//ע��ɹ�����1�����ɹ�����0
public int login(UserEntity user) throws SQLException, ClassNotFoundException {
	final String URL="jdbc:mysql://localhost:3306/test";//test�Ǵ��������ݿ���
	final String USERNAME="root";
	final String PWD="123456";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection(URL,USERNAME,PWD);
	
	//����preparedStatement����
	//sql�Ĺ����ǲ���ָ�����û���������
	String sql="select * from student where name=? and pwd=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	//�������ʺŴ���ֵ
	pstmt.setString(1, user.getUsrname());
	pstmt.setString(2, user.getPwd());
	//ִ��sql��䣬���������rs��
	ResultSet rs=pstmt.executeQuery();
	//rs.next()��ʾrs����û�����ݣ�Ҳ��������sql��û�в�ѯ�����
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
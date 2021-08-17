package kr.co.job.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.sql.SQLException;

public class Test02DbConn {

	Connection conn = null;
//	Statement stmt = null;
//	PreparedStatement pstmt = null;
//	ResultSet rs = null;
//	List<Test02VO> list = null;
//	int result = 0;

	public Test02DbConn() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest?serverTimeZone=UTC";
			String id = "root";
			String pw = "123456";

			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("connected! :D");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}

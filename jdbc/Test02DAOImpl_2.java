package kr.co.job.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02DAOImpl_2 implements Test02DAO {

	static Test02DbConn dbConn = new Test02DbConn(); // server connected!
	static Scanner scan = new Scanner(System.in);
	static Statement stmt;
	static PreparedStatement pstmt;
	static ResultSet rs;
	static int result;
	static List<Test02VO> list;
	static ArrayList<Test02VO> delList;

	public int viewMenu() {

		System.out.println("=============================== [ M E N U ] ===============================");
		System.out.println("1.veiw All  2.view One  3.insert  4.update  5.delete  6.delete List 7.close");
		System.out.print("Select Number : ");
		return scan.nextInt();
	}

	@Override
	public int selectAll() {
		try {
			String sql = "SELECT * FROM test01 WHERE del=0";
			stmt = dbConn.conn.createStatement();
			rs = stmt.executeQuery(sql);

			list = new ArrayList<Test02VO>();
			while (rs.next()) {
				int tno = rs.getInt(1);
				String pname = rs.getString(2);
				int age = rs.getInt(3);
				String etc = rs.getString(4);

				list.add(new Test02VO(tno, pname, age, etc));
			}

			for (Test02VO allList : list) {
				System.out.println(allList.toString());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return 0;
	} // selectAll()

	@Override
	public int selectOne() {
		try {
			System.out.println("=== [ Find by tno ] ===");
			System.out.print("tno : ");
			int tno = scan.nextInt();
			String sql = "select * from test01 WHERE del=0 and tno=?";
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();

			if (!rs.next()) {
				System.out.println("Sorry:( Not Found Data");
			} else {
				Test02VO t = new Test02VO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				System.out.println(t);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	} // selectOne()

	@Override
	public int insert() {
		try {
			System.out.println("===== [ Insert Value ] =====");
			System.out.print("name : ");
			String pname = scan.next();
			System.out.print("age : ");
			int age = scan.nextInt();
			System.out.print("etc : ");
			String etc = scan.next();

			String sql = "INSERT INTO test01 (pname, age, etc, del) VALUES (?, ?, ?, 0)";
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setString(1, pname);
			pstmt.setInt(2, age);
			pstmt.setString(3, etc);
			result = pstmt.executeUpdate(); // fail==0

			if (result == 0) {
				System.out.println("Sorry, Insertion Failed :(");
			} else {
				System.out.println("*~Insert Successful~*");
				String sql2 = "SELECT * FROM test01 WHERE del=0 ORDER BY tno DESC LIMIT 1"; // last insert select
				stmt = dbConn.conn.createStatement();
				rs = stmt.executeQuery(sql2); // ★★re가 있으면 re.next()가 꼭 있어야한다!

				if (rs.next()) {
					Test02VO t = new Test02VO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
					System.out.println(t);
					System.out.println("Inserted Now : " + t);
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	} // insert()

	@Override
	public int update() {
		try {
			System.out.println("=== [ Update to tno ] ===");
			System.out.print("tno : ");
			int tno = scan.nextInt();
			System.out.print("name : ");
			String pname = scan.next();
			System.out.print("age : ");
			int age = scan.nextInt();
			System.out.print("etc : ");
			String etc = scan.next();

			String sql = "UPDATE test01 SET pname=?, age=?, etc=? WHERE del=0 and tno=? ";
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setString(1, pname);
			pstmt.setInt(2, age);
			pstmt.setString(3, etc);
			pstmt.setInt(4, tno);
			result = pstmt.executeUpdate(); // fail==0

			if (result == 0) {
				System.out.println("Sorry, Update Failed :(");
			} else {
				System.out.println("*~Update Successful~*");

				String sql2 = "select * from test01 WHERE del=0 and tno=?"; // update chck
				pstmt = dbConn.conn.prepareStatement(sql2);
				pstmt.setInt(1, tno);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					Test02VO t = new Test02VO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
					System.out.println(t);
					
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}// update()

	@Override
	public int delete() {
		try {
			System.out.println("=== [ Delete by tno ] ===");
			System.out.print("tno : ");
			int tno = scan.nextInt();
			String sql = "UPDATE test01 SET del=1 WHERE del=0 and tno=? ";
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			result = pstmt.executeUpdate(); // fail==0

			if (result == 0) {
				System.out.println("Sorry, Delete Failed :(");
			} else {
				System.out.println("*~Delete Successful~*");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}// delete()

	public void delListView() {
		try {
			String sql = "select * from test01 WHERE del=1"; // delete search...
			stmt = dbConn.conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			delList = new ArrayList<Test02VO>();

			while (rs.next()) {
				int tno = rs.getInt(1);
				String pname = rs.getString(2);
				int age = rs.getInt(3);
				String etc = rs.getString(4);

				delList.add(new Test02VO(tno, pname, age, etc)); // delete list making...
			}

			for (Test02VO delList_view : delList) {
				System.out.println(delList_view);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int dbclose() { //server close 
		try {
			if(dbConn.conn != null && !dbConn.conn.isClosed()) // !=null == body exists(동사)
				dbConn.conn.close();
			if(pstmt != null && !pstmt.isClosed())
				pstmt.close();
			if(stmt != null && !stmt.isClosed())
				stmt.close();
			if(rs != null && !rs.isClosed())
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}

}

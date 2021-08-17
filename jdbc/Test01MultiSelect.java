package kr.co.job.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fuckingMySQL {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ArrayList<Test01VO> list = null; // 주소를 던짐
		String mysql = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(mysql);
			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pass = "123456";

			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("DataBase Connection Complete!");
			stmt = conn.createStatement(); // 질의문작성가능

			boolean veiw = true;
			while (veiw) {
				int pick = selectMenu();
				switch (pick) {
				case 1: // 전체조회
					String sql = "SELECT tno, pname, age, etc FROM test01"; // 질의문작성하기
					rs = stmt.executeQuery(sql); // 질의문을 결과에 담은
					arryList(rs, list);
					break;

				case 2: // 검색조회
					System.out.print("검색할 순번입력 :");
					int searchTno = scan.nextInt();
						String sql3 = "SELECT tno, pname, age, etc FROM test01 WHERE tno=?";
						pstmt = conn.prepareStatement(sql3);
						pstmt.setInt(1, searchTno);
						rs = pstmt.executeQuery(); // ctal + enter
							arryList(rs, list);
						
					break;

				case 3: // 이름조회
					nameAllView(conn);
					break;

				case 4: // 종료
					System.out.println("프로그램을 종료합니다.");
					veiw = false;
					break;

				default:
					System.out.println("잘못 입력하였습니다.");
					break;

				} // swutch
			} // while

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // main

	private static int selectMenu() {
		System.out.println("============= [ 메 뉴 ] =============");
		System.out.println("1.전체조회  2.검색조회  3.이름전체조회  4.종료");
		System.out.print("select number : ");
		int pick = 0;
		return pick = scan.nextInt();
	}

	private static void nameAllView(Connection conn) { //전체이름조회
		List<String> listname = new ArrayList<String>();
		try {
			Statement stmt = conn.createStatement(); //연결한서버를 작성할수있게?
			String sql2 = "SELECT pname FROM test01"; // 이름만 조회
			ResultSet rs = stmt.executeQuery(sql2);
			
			while (rs.next()) {
				listname.add(rs.getString(1)); // db이름들 리스트에넣기
			}
			
			for (int i = 0; i < listname.size(); i++) {
				System.out.print(listname.get(i));
				
				if (i == 3 || i == (listname.size() - 1)) {
					System.out.println();
				} else {
					System.out.print(", ");
				}
		
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} //nameView();

	private static void arryList(ResultSet rs, ArrayList<Test01VO> list) { // 리스트에 담기
		try {
			list = new ArrayList<Test01VO>();
			while (rs.next()) {
				Test01VO tvo = new Test01VO(); // **중요

				int tno = rs.getInt(1); // tno 객체에 담기
				String pname = rs.getString(2);
				int age = rs.getInt(3);
				String etc = rs.getString(4);

				tvo.setTno(tno);
				tvo.setPname(pname);
				tvo.setAge(age);
				tvo.setEtc(etc);

				list.add(tvo);
			} // while

			if(list.size()>0 ) {
				for (Test01VO result : list) {
					System.out.print("순번=" + result.getTno());
					System.out.print(" 이름=" + result.getPname());
					System.out.print(" 나이=" + result.getAge());
					System.out.print(" 비고=" + result.getEtc() + "\n");
				} // for
			}else {
				System.out.println("데이터가 없습니다.");
			}

		} // try
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // arryList();

} // class

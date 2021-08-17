/*
 * test01 테이블에 번호가 2인 레코드에 나이와 비고를 
 * 키보드로 입력받아서 수정해보기
 * update test01
set etc = 'hhhh', age = 55
where tno = 2;
 * 
 */
package kr.co.job.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateTest01 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		InputScanner s = new InputScanner();
		
//		수정할 내용 키보드 입력
		System.out.print("수정할 번호를 입력 : " );
		int tno = Integer.parseInt(s.scan.next());
		
		System.out.print("수정할 나이 입력 : ");
//		int age = Integer.parseInt(s.scan.next());
		int age = s.onlyInt();
		
		System.out.print("수정할 비고 입력 : ");
		String etc = s.scan.next();		
		
//		데이터베이스 연동드라이브-> 연결
//		Connection conn = null;
		DbConnection Dbconn = new DbConnection();
		PreparedStatement pstmt = null;
		
		try {	//DB연결삭제
			
//			질의문 작성(update)
			String sql = "update test01 set etc = ?, age = ? where tno = ?";
			pstmt = Dbconn.conn.prepareStatement(sql);
			
			pstmt.setString(1, etc);
			pstmt.setInt(2, age);
			pstmt.setInt(3, tno);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt ==0)
				System.out.println("데이터 수정 실패");
			else
				System.out.println("데이터 수정성공");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(Dbconn.conn !=null && !Dbconn.conn.isClosed())
					Dbconn.conn.close();
				if(pstmt !=null && !pstmt.isClosed())
					pstmt.close();
					
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
//		질의문작성 및 실행
		
//		수정여부 확인 출력
		

	}

}



















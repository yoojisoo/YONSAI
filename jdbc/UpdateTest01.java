/*
 * test01 ���̺� ��ȣ�� 2�� ���ڵ忡 ���̿� ��� 
 * Ű����� �Է¹޾Ƽ� �����غ���
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
		
//		������ ���� Ű���� �Է�
		System.out.print("������ ��ȣ�� �Է� : " );
		int tno = Integer.parseInt(s.scan.next());
		
		System.out.print("������ ���� �Է� : ");
//		int age = Integer.parseInt(s.scan.next());
		int age = s.onlyInt();
		
		System.out.print("������ ��� �Է� : ");
		String etc = s.scan.next();		
		
//		�����ͺ��̽� ��������̺�-> ����
//		Connection conn = null;
		DbConnection Dbconn = new DbConnection();
		PreparedStatement pstmt = null;
		
		try {	//DB�������
			
//			���ǹ� �ۼ�(update)
			String sql = "update test01 set etc = ?, age = ? where tno = ?";
			pstmt = Dbconn.conn.prepareStatement(sql);
			
			pstmt.setString(1, etc);
			pstmt.setInt(2, age);
			pstmt.setInt(3, tno);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt ==0)
				System.out.println("������ ���� ����");
			else
				System.out.println("������ ��������");
			
			
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
		
//		���ǹ��ۼ� �� ����
		
//		�������� Ȯ�� ���
		

	}

}



















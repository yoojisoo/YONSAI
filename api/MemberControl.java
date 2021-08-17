/*
 * 1.시스템 초기화
 * 2.메뉴 구성
 * 3.각 선택메뉴별 기능
 * 		-회원가입, 회원수정, 회원삭제, 회원조회(전체조회), 개별조회
 */
package kr.co.job.api;

import java.util.Scanner;

public class MemberControl {
	static Scanner scan = new Scanner(System.in); //콘솔입력(입출력)

	public static void main(String[] args) {
		//
		System.out.println("회원가입을 시작합니다.");
		Member m1; //선언
		//입력
		System.out.print("번호를 입력하세요 : ");
		String no = scan.next();
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("ID를 입력하세요 : ");
		String id = scan.next();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
//		m1 = new Member(no, id, name, age); //1번-이렇게 초기화하거나
		
		m1 = new Member(); //2번-이렇게 초기화하거나
		
		m1.setNo(no);
		m1.setName(name);
		m1.setId(id);
		m1.setAge(age);
		
		System.out.println("회원가입이 완료되었습니다.");
		
		//회원 정보 조회
		//수정하기
		boolean modify = true; 
		
		while(modify) {
//			System.out.println("[회원정보 조회]");
//			System.out.println("번호 : " + m1.getNo());
//			System.out.println("이름 : " + m1.getName());
//			System.out.println("ID : "  + m1.getId());
//			System.out.println("나이 : " + m1.getAge());
			
			System.out.println("=========== 수정하기 ===========");
			System.out.println("1.번호 2.이름 3.아이디 4.나이 99.종료");
			System.out.print("Select Number : ");
			int selectNumber = scan.nextInt();
			
			switch(selectNumber) {
			case 1 :
				System.out.print("번호 수정 : ");
				no = scan.next();
				m1.setNo(no);
				System.out.println("수정된 번호 : "+no);
				break;
				
			case 2 :
				System.out.print("이름 수정 : ");
				name = scan.next();
				m1.setName(name);
				System.out.println("수정된 이름 : "+name);
				break;
				
			case 3 :
				System.out.print("ID 수정 : ");
				id = scan.next();
				m1.setId(id);
				System.out.println("수정된 ID : "+id);
				break;
				
			case 4 :
				System.out.print("나이 수정 : ");
				age = scan.nextInt();
				m1.setAge(age);
				System.out.println("수정된 나이 : "+age);
				break;
				
			case 99 :
				System.out.print("수정하기가 종료됩니다.");
				modify = false;
				break;
				
			default :
				System.out.println("잘못 입력하였습니다.");
				
			}//switch
			System.out.println("입력하신 수정 회원정보를 확인하겠습니다.");
			System.out.println(m1);
					
		}//while

	}

}

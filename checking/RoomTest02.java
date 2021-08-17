/*
 * 방 예약 : 12개 방
 * --------[메뉴]--------
 * 1.방예약  2.예약취소  3.호실확인  99.종료
 * 
 * int[] room = {0,}
 * room[3] => 0   //예약가능
 * room[3] => 1   //예약불가
 * 
 * 초기화 => 반복문구 : 메뉴->선택실행
 * 방번호, 방가격
 * 예약시 예약자명, 예약번호, 예약인원을 입력받기.
 * 예약취소시는 예약번호를 기준으로 취소한다.
 * 
 */
package kr.co.job.checking;

import java.util.Arrays;
import java.util.Scanner;

public class RoomTest02 { //클래스

	static Scanner scan = new Scanner(System.in);  //전역
	
	public static void main(String[] args) { //메인
//		                       0           1            2             3            4               5          6           7            8            9           10              11
		String[] roomName = {"deluxe", "deluxeOcean", "deluxeRuby", "premium", "premiumOcean", "premiumRuby", "sweet", "sweetOcean", "sweetRuby", "special", "specialOcean", "specialRuby"};
		int[] roomNo = new int[12];  // 방번호 값이 1~12  
		int[] booking = new int[12];  // 방의 예약여부

		int pick1=0, pick2=0, pick3=0;
		boolean front = true;
		
		for(int i=0;i<roomNo.length;i++) {
			roomNo[i]= i+1;
//			System.out.print("[룸 번호] "+ roomNo[i]);			
//			System.out.println(" [룸 이름]" + roomName[i]);
		}
	
				
		while(front) {
			
			int choose1 = menuSelect();
			
			switch(choose1) {
			case 1 : //방예약
				viewRoom(booking,roomNo, roomName); //호실보여주기
				roomReserv(booking,roomNo, roomName);  // 예약진행				
				viewRoom(booking,roomNo, roomName);  // 호실보여주기
				break;
				
			case 2 : //예약취소
				canselRoom(booking, roomName);
							
				viewRoom(booking,roomNo, roomName);  // 호실보여주기
				break;
			case 3 : //호실확인 (예약가능 / 만실)
				viewRoom(booking,roomNo, roomName);
				
				break;
			case 99 : //종료
				System.out.println("예약을 종료합니다.");
				break;
			default : 
				System.out.println("처음으로 돌아가세요.");
				break;
			}
		}
		
		
		
		

	} //메인

	
	private static int menuSelect() {
		System.out.println("-------------[메 뉴]-------------");
		System.out.println("1.방예약  2.예약취소  3.호실확인  99.종료");
		System.out.print("select Menu : ");
		return scan.nextInt();
	}


	//예약취소하기
	private static void canselRoom(int[] booking, String[] roomName) {
		// TODO Auto-generated method stub
		System.out.print("취소하실 방번호을 입력하세요(1-12) : ");
		int k = scan.nextInt();
		
		if(booking[k-1] != 0) { //1인 roomName 보여줘.
			System.out.println(roomName[k-1]+"room이 예약되어 있습니다. 취소하시겠습니까?");
			System.out.println("Y or N");
			String tmp = scan.next();
			if(tmp == "Y") {
				booking[k] = 0;
				System.out.println(roomName[k]+"room이 취소되었습니다.");
			}
			else {
				System.out.println("예약을 유지합니다.");
			}
		}
		else { //0일때는?						
			System.out.println("예약된 room이 없습니다. 처음으로 되돌아가세요.");						
		}
	}

	//예약하기 메소드
	private static void roomReserv(int[] booking,int[] roomNo, String[] roomName) {
		System.out.println("[객실선택]");
		for(int i=0; i<roomName.length; i++) {
			System.out.print(roomNo[i]+"."+roomName[i]+" ");					
		}
		System.out.println();
		System.out.println("원하시는 객실을 선택해 주세요.");
		int choose2 = scan.nextInt();
		if(choose2>=1 && choose2<=12) {
			booking[choose2-1]=1; //예약
			System.out.println(roomName[choose2-1]+" Room예약되었습니다.");
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}
		
	
	}

	private static void viewRoom(int[] booking,int[] roomNo, String[] roomName) {
		System.out.println("예약가능:○ | 예약불가:■");
		for(int i=0; i<booking.length; i++) { //i값이 같아서 ^^
			System.out.print("roomNo : " + roomNo[i] +" : ");
			if(booking[i] == 0) {
				System.out.println(roomName[i]+"(○)");
			}
			else {
				System.out.println(roomName[i]+"(■)");						
			}
		}
		
	}

} //클래스

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
import java.util.regex.Pattern;

public class RoomTest01 { //클래스

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) { //메인	
//		                       0           1            2             3            4               5          6           7            8            9           10              11
		String[] roomName = {"deluxe", "deluxeOcean", "deluxeRuby", "premium", "premiumOcean", "premiumRuby", "sweet", "sweetOcean", "sweetRuby", "special", "specialOcean", "specialRuby"};
		String[] roomNo = {"01.", "02.", "03.", "04.", "05.", "06.", "07.", "08.", "09.", "10.", "11.", "12."};
		String[] booName = new String[12]; //에약이름
		String[] booPw = new String[12]; //예약비번
		String[] booNumber = new String[12]; //예약인원
		String[] booPhone = new String[12]; //예약핸드폰
		int[] booking = new int[12];  // 방의 예약여부
		
		
	
		
		
		boolean front = true;
		int sel=0, cel=0, boo=0;
		for(int i=0;i<roomNo.length;i++) { //String initial
			booName[i] = "NO";			
			booPhone[i] = "000";			
		}
		
				
		while(front) {
			sel = menuSelect(roomNo, roomName, booking); //스캔 입력받은걸 던져서 츄즈1에 대입
			
			switch(sel) {
			case 1 : //방예약
				viewRoom(roomNo, roomName, booking);
				boo = roomReserv(roomNo, roomName, booking, booName, booPw, booNumber, booPhone);
				break;
				
			case 2 : //예약취소
				viewRoom(roomNo, roomName, booking);
				cel = cancelRoom(roomNo, roomName, booking, booName, booPw, booNumber, booPhone);
				break;
				
			case 3 : //호실확인
				viewRoom(roomNo, roomName, booking);
				break;
				
			case 4 : //예약확인
				findRoom(roomNo, roomName, booName, booNumber, booPhone);
				break;

			case 99 : //종료
				System.out.println("종료합니다.");
				front=false;
				break;
				
			default : 
				System.out.println("잘못 입력하였습니다.");
				break;
			} //switch
		} //while
		
		
		
	

	} //메인
	

		
	

	private static int menuSelect(String[]roomNo, String[]roomName, int[]booking) { //메뉴
		System.out.println("\n-----------[메 뉴]-------------");
		System.out.println("1.방예약  2.예약취소  3.호실확인  4.예약확인  99.종료");
		System.out.print("select number : ");
		int sel = scan.nextInt();
		return sel;
	
	}
	
	private static void viewRoom(String[]roomNo, String[]roomName, int[]booking) { //호실확인 
		System.out.println("예약가능(○) | 예약불가(■)");
		int count=0, line=3;
		for(int i=0; i<roomNo.length; i++) {
			if(booking[i] == 0) {
//				System.out.print(roomNo[i]+roomName[i]+"(○)  ");
				System.out.printf("%4s %14s (○)   ",roomNo[i],roomName[i]);
			}
			else {
//				System.out.print(roomNo[i]+roomName[i]+"(■)  ");
				System.out.printf("%4s %14s (■)   ",roomNo[i],roomName[i]);
			}
			count++; //★증가 제일 중요 ^^★
	        if(count==line) {
                System.out.println();
                count = 0;
             }
		}//for
	}

	private static int roomReserv(String[]roomNo, String[]roomName, int[]booking, String[]booName, String[]booPw, String[]booNumber, String[]booPhone) { //예약
		System.out.println("예약할 객실의 number를 입력 :");
		int boo = scan.nextInt();
		if(boo>=1 && boo<=12) {
			if(booking[boo-1]==0) {
				System.out.print("예약자명 : ");
				booName[boo-1] = scan.next();
				System.out.print("전화번호 : ex)01045188672 ");
				booPhone[boo-1] = scan.next();
				System.out.print("예약인원 : ");
				booNumber[boo-1] = scan.next();
				System.out.print("예약비밀번호(4자리) : ");
				booPw[boo-1] = scan.next();
				
				System.out.println(roomNo[boo-1]+roomName[boo-1]+" 객실이 예약되었습니다.");
				System.out.print("예약자명 : "+booName[boo-1]+"  예약인원 : "+booNumber[boo-1]+"명");		
				booking[boo-1] = 1;				
			}
			else {
				System.out.println("이미 예약된 객실입니다.");								
			}
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}
		return boo;
		
		}
	
	private static void findRoom(String[] roomNo, String[] roomName, String[]booName,  String[]booNumber, String[]booPhone) {
		System.out.print("1.예약자명으로 찾기  2.핸드폰번호로 찾기");
		System.out.print("\nselect number : ");
		int find = scan.nextInt();
		
		if(find == 1) {
			System.out.print("예약자명 : ");
			String findName = scan.next();
			
			int n = searchRev(findName, booName);
			if(n != -1) {				
				System.out.println(roomNo[n]+roomName[n]+"객실 인원수("+booNumber[n]+") 예약되어있습니다.");
			}
			else {				
				System.out.println(findName+"으로 예약된 객실이 없습니다.");
			}
			
		} //if		
		else if(find == 2) {
			System.out.print("phone number : ex)01045188672 ");
			String findPhone = scan.next();	
			
			int r = searchRev2(findPhone, booPhone);
			if(r != -1) {				
				System.out.println(roomNo[r]+roomName[r]+"객실 인원수("+booNumber[r]+") 예약되어있습니다.");
				System.out.println("다시 찾기");
				
			}
			else {				
				System.out.println(findPhone+"으로 예약된 객실이 없습니다.");
			}
		}
		else {
			System.out.println("잘못 입력하였습니다.");			
		}
		
	}//메소드)
	

//  찾으면 인덱스가 리턴, 없으면 -1이 리턴됨.
	private static int searchRev(String findName, String[]booName) { //이름찾기
		int i=0;
		boolean eq = false;
		for(; i<booName.length; i++) {
			if(booName[i].equals(findName)) {  //같으면 인덱스i, 트루. 중지. 
				eq = true;
				return i;
			}
		}
		i = -1;  // no search
		return i;
	}

//  찾으면 인덱스가 리턴, 없으면 -1이 리턴됨.
	private static int searchRev2(String findPhone, String[]booPhone) { //번호찾기
		int r=0;
		boolean ph = false;
		for(; r<booPhone.length; r++) {
			if(booPhone[r].equals(findPhone)) {  //같으면 인덱스r, 트루. 중지. 
				ph = true;
				return r;
			}
		}
		r = -1;  // no search
		return r;
	}



	private static int cancelRoom(String[]roomNo, String[]roomName, int[]booking, String[]booName, String[]booPw, String[]booNumber, String[]booPhone) { //예약취소
		System.out.println("취소할 객실의 number를 입력 : ");
		int cel = scan.nextInt();
		if(cel>=1 && cel<=12) {
			if(booking[cel-1] != 0) {
//				System.out.println("비번화아기이인:"+booPw[cel-1]);				
				System.out.print("예약비밀번호를 입력하세요 : ");
				String booPw2 = scan.next();
				if(booPw[cel-1].equals(booPw2)) {					
					booking[cel-1]=0;
					booName[cel-1]="";
					booPw[cel-1]="";
					booNumber[cel-1]="";
					booPhone[cel-1]="";
					System.out.println(roomNo[cel-1]+roomName[cel-1]+" 객실예약이 취소되었습니다.");	
				}
				else {
					System.out.println("비밀번호가 틀렸습니다.");
					pwSearch(); //비번찾아주기
				}
			}
			else {
				System.out.println("예약된 객실이 없습니다.");
			}
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}
		return cel;
		
	}


	private static void pwSearch() {
		System.out.println("비밀번호를 찾으시겠습니까?");
		System.out.println("Y or N");
		String pwsearch2 = scan.next();
		if(pwsearch2.equals("Y") || pwsearch2.equals("y")) { //y는 왜안돼
			System.out.println("등록된 이메일로 비밀번호 재설정 방법을 보내드렸습니다.");
		}
		else if(pwsearch2.equals("N") || pwsearch2.equals("n")) {
			System.out.println("menu로 되돌아갑니다.");
		}
		else {
			System.out.println("잘못 입력하였습니다.");			
		}

	}

} //클래스

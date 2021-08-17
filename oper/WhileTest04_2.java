package kr.co.job.oper;

import java.awt.Window.Type;
import java.util.Scanner;

public class WhileTest04_2 {

	public static void main(String[] args) {
		
		// 자판기!! --- 배열로 수정!!!!!!! 더어려운 배열 !!!!!!!!!!!!!!!
		int pay=0, num=0;
		boolean done=true;
				
		
		String[][] drink = new String[3][3];
		drink[0][0] = "콜라";
		drink[0][1] = "사이다";
		drink[0][2] = "커피";
		drink[1][0] = "500";
		drink[1][1] = "500";
		drink[1][2] = "1000";
		
		
		//System.out.println(drink[1][0]);
		int a = Integer.parseInt(drink[1][0]+500);
		String b = drink[1][0]+500000000;
		System.out.println(a);
		System.out.println(b);
//		Scanner scan = new Scanner(System.in);
//		int money;
//		
//		for(int i =0; i<3; i++) {
//			System.out.print((i+1)+"번째 음료 이름: ");
//			drink[i] = scan.nextLine();
//			System.out.print((i+1)+"번째 음료 가격: ");
//			price[i] = scan.nextInt();
//			scan.nextLine();
//		}
//		
//		
//		while(done) {
//			System.out.println("==========잔액:"+pay+"==============");
//			System.out.println("1, 동전투입   2, 음료선택   3, 남은개수");
//			System.out.println("==========4, 반환   99, 종료=========");
//			num = scan.nextInt();
//			switch(num) {
//			case 1:
//				System.out.println("=========입금:===========");
//				money = scan.nextInt();
//				pay = pay+money;
//				break;
//			case 2: //음료선택
//				int num2=0;
//				System.out.println("1, "+drink[0]+"("+price[0]+"원)  2, "+drink[1]+"("+price[1]+"원)  3, "+drink[2]+"("+price[2]+"원)");
//				num2 = scan.nextInt();
//				
//				if(num2==1) { // 사이다 선택
//					if(namugi[0] != 0) {
//						if(pay<price[0]) { //잔액이 없으면!???
//							System.out.println("잔액을 확인하세요.");
//							continue;
//						}
//						else { //잔액이 있다면
//							System.out.println(drink[0]+"1잔 구매완료.");
//							pay = pay - price[0];
//							namugi[0]--;
//						}
//					}
//					else {
//						System.out.println(drink[0]+"는 품절입니다.");
//					}
//				}
//				
//				else if(num2==2) { //콜라 선택
//					if(namugi[1] != 0) {
//						if(pay<price[1]) { //잔액이 없다면
//							System.out.println("잔액을 확인하세요.");
//							continue;						
//						}
//						else { //잔액이 있다면
//							System.out.println(drink[1]+" 1잔 구매완료.");										
//							pay = pay - price[1];
//							namugi[1]--;
//						}
//					}
//					else {
//						System.out.println(drink[1]+"는 품절입니다.");
//					}
//				}
//				
//				else if(num2==3) { //커피선택
//					if(namugi[2] != 0) {
//						if(pay<price[2]) { //돈없으면
//							System.out.println("잔액을 확인하세요.");
//							continue;												
//						}
//						else { //돈있으면
//							System.out.println(drink[2]+"1잔 구매완료.");										
//							pay = pay - price[2];
//							namugi[2]--;
//						}
//					}
//					else {
//						System.out.println(drink[2]+"는 품절입니다.");
//					}
//				}
//				
//				else { //아니라면!?
//					System.out.println("잘못 선택하였습니다.");
//					continue;											
//				}
//				break;
//
//			case 3: //남은개수
//				System.out.println("음료 남은 개수");
//				System.out.println(drink[0]+namugi[0]+"   "+drink[1]+namugi[1]+"   "+drink[2]+namugi[2]);
//				break;
//			case 4:
//				System.out.println(pay+"원 반환합니다.");
//				pay=0;
//				break;
//			case 99: //종료
//				System.out.println("종료 합니다.");
//				done = false;
//				break;
//			
//			default :
//				System.out.println("잘못 선택하였습니다.");
//				continue;
//			}
//		}
		
		
		
		
	}//

}//

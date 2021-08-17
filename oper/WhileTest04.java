package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		// 자판기!! --- 배열로 수정!!!!!!!
		String[] drink = new String[3]; //음료이름
		int[] price = new int[3]; //음료가격
		int[] namugi = new int[3]; //음료갯수
		int pay=0, num=0;
		boolean done=true;
				
		drink[0] = "사이다";		
		drink[1] = "콜라";
		drink[2] = "커피";
		
		price[0] = 500;
		price[1] = 500;
		price[2] = 1000;
		
		namugi[0] = 2;		
		namugi[1] = 2;
		namugi[2] = 2;
		
		
		
		Scanner scan = new Scanner(System.in);
		int money;
		
		
		while(done) {
			System.out.println("==========잔액:"+pay+"==============");
			System.out.println("1, 동전투입   2, 음료선택   3, 남은개수");
			System.out.println("==========4, 반환   99, 종료=========");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("=========입금:===========");
				money = scan.nextInt(); //지금넣는돈
				pay = pay+money; //지갑
				break;
			case 2: //음료선택
				int num2=0;
				System.out.println("1, 사이다(500원)  2, 콜라(500원)  3, 커피(1000원)");
				num2 = scan.nextInt();
				
				if(num2==1) { // 사이다 선택
					if(namugi[0] != 0) {
						if(pay<price[0]) { //잔액이 없으면!???
							System.out.println("잔액을 확인하세요.");
							continue;
						}
						else { //잔액이 있다면
							System.out.println("사이다 1잔 구매완료.");
							pay = pay - price[0];
							namugi[0]--;
						}
					}
					else {
						System.out.println("사이다는 품절입니다.");
					}
				}
				
				else if(num2==2) { //콜라 선택
					if(namugi[1] != 0) {
						if(pay<price[1]) { //잔액이 없다면
							System.out.println("잔액을 확인하세요.");
							continue;						
						}
						else { //잔액이 있다면
							System.out.println("콜라 1잔 구매완료.");										
							pay = pay - price[1];
							namugi[1]--;
						}
					}
					else {
						System.out.println("콜라는 품절입니다.");
					}
				}
				
				else if(num2==3) { //커피선택
					if(namugi[2] != 0) {
						if(pay<price[2]) { //돈없으면
							System.out.println("잔액을 확인하세요.");
							continue;												
						}
						else { //돈있으면
							System.out.println("커피 1잔 구매완료.");										
							pay = pay - price[2];
							namugi[2]--;
						}
					}
					else {
						System.out.println("커피는 품절입니다.");
					}
				}
				
				else { //아니라면!?
					System.out.println("잘못 선택하였습니다.");
					continue;											
				}
				break;

			case 3: //남은개수
				System.out.println("음료 남은 개수");
				System.out.println(drink[0]+namugi[0]+"   "+drink[1]+namugi[1]+"   "+drink[2]+namugi[2]);
				break;
			case 4:
				System.out.println(pay+"원 반환합니다.");
				pay=0;
				break;
			case 99: //종료
				System.out.println("종료 합니다.");
				done = false;
				break;		
			default :
				System.out.println("잘못 선택하였습니다.");
				continue;
			}
		}
		
		
		
		
	}//

}//

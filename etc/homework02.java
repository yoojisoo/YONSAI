package kr.co.job.etc;

import java.util.Scanner;

public class homework02 {

	public static void main(String[] args) {
		/* 스캔으로 입력받아서 이름/가격/개수 정하기
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<3; i++) {
			System.out.print((i+1)+"번째 음료 이름: ");
			drinkName[i] = scan.nextLine();
			System.out.print((i+1)+"번째 음료 가격: ");
			drinkPrice[i] = scan.nextInt();
			System.out.print((i+1)+"번째 음료 개수: ");
			drinkCount[i] = scan.nextInt();		
			scan.nextLine();
		}
		for(int i = 0; i<3; i++) { //입력값 확인하기
			System.out.print("이름:"+drinkName[i]+"("+drinkPrice[i]+")"+" 재고:"+drinkCount[i]);
		}
		 */

		
		// 선언:1차원배열
		String[] drinkName = new String[3]; //이름
		drinkName[0] = "사이다";
		drinkName[1] = "콜라";
		drinkName[2] = "커피";
		
		int[] drinkPrice = new int[3]; //가격
		drinkPrice[0] = 500;
		drinkPrice[1] = 500;
		drinkPrice[2] = 1000;
		
		int[] drinkCount = new int[3]; //개수
		drinkCount[0] = 5;
		drinkCount[1] = 5;
		drinkCount[2] = 5;
		
		int[] coin = new int[3]; //충전금액
		coin[0] = 100;
		coin[1] = 500;
		coin[2] = 1000;
		
		Scanner scan = new Scanner(System.in);
		int pickOne=0, pickTwo=0, pickThree=0; //케이스, 금액, 음료선택
		int totalCoin=0; //지금넣는돈, 모아져있는돈
		boolean done=true;
		
		while(done) {
		System.out.println("-----------[ MENU | 현재잔액:"+totalCoin+" ]-----------");
		System.out.println("1.금액충전 2.음료수선택 3.음료남은개수 4.금액반환 99.종료");
		System.out.println("--------------------------------------------");
		pickOne = scan.nextInt();
		switch(pickOne) {
			case 1: //금액선택
				System.out.println("1.100원 2.500원 3.1000원");
				pickTwo = scan.nextInt();
				if(pickTwo==1||pickTwo==2||pickTwo==3) {			
					totalCoin = totalCoin+coin[pickTwo-1];
					System.out.println(coin[pickTwo-1]+"원 충전되었습니다.");
				}
				else {
					System.out.println("잘못 선택하였습니다.");					
				}
			break; //case1
				/*
				pickTwo = scan.nextInt();
				if(pickTwo==1) {
					coin = 100;					
					totalCoin = coin + totalCoin;
					System.out.println(coin+"원 충전되었습니다.");
				}
				else if(pickTwo==2) {
					coin = 500;					
					totalCoin = coin + totalCoin;					
					System.out.println(coin+"원 충전되었습니다.");
				}
				else if(pickTwo==3) {
					coin = 1000;					
					totalCoin = coin + totalCoin;
					System.out.println(coin+"원 충전되었습니다.");
				}
				else {
					System.out.println("잘못 선택하였습니다.");
				}
			break; //case1
			*/
				
			case 2: //음료수선택
				System.out.println("1.사이다  2.콜라  3.커피");
				pickThree = scan.nextInt();
				if(pickThree==1 || pickThree==2 || pickThree==3) { //음료 1.2.3 선택
					if(drinkCount[pickThree-1]>0) { //재고가 있다면
						if(totalCoin>=drinkPrice[pickThree-1]) { //돈이 있다면
							drinkCount[pickThree-1] = drinkCount[pickThree-1]-1; //개수차감
							totalCoin -= drinkPrice[0]; // totalCoin = totalCoin-drinkPrice[0]
							System.out.println(drinkName[pickThree-1] + "를 구매하셨습니다.");						
							System.out.println("남은 재고 : "+drinkCount[pickThree-1]+"개");													
						}
						else { //돈이 없다면
							System.out.println("잔액이 부족합니다.");												
							continue;
						}
					}
					else { //재고가 없다면
						System.out.println("재고가 부족합니다.");						
						continue;
					}					
				}
				else { //음료수선택이 아니라면
					System.out.println("잘못 선택하였습니다.");					
					continue;
				}					
			break; //case2
			
			case 3: //남은개수
				for(int i =0;i<3;i++) {
					System.out.println(drinkName[i]+" 남은 재고 : "+drinkCount[i]+"개");
				}
				break;
			
			case 4: //반환
				System.out.println("잔액 "+totalCoin+"원 반환합니다.");
				totalCoin=0;
				System.out.println("남은잔액 : "+totalCoin+"원");
				break;
								
			case 99: //자판기종료
				System.out.println("종료 됩니다.");
				done=false;
				break;
				
			default	:
				System.out.println("잘못 선택하였습니다.");
				continue;
		} //end switch
		} //end while
		
		
		
	} //end of main()
	
} // end class

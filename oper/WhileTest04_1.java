package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest04_1 {

	public static void main(String[] args) {
		/*
		 * While문과 Math.random() 메소드를 이용
		 * 
		 * 1~6의 눈을 갖는 두개의 주사위를 던졌을 때
		 * 주사의 눈의 값을 (1주사위눈, 2주사위 눈)형태로 출력하고
		 * 두개의 눈이 서로 다른 값이면 계속 주사위를 던지고
		 * 두개의 눈이 같으면 멈추는 코드 작성
		 * 
		 */

		/*
		int dice1, dice2=0;
		boolean done = true;
		
		while(done) {
			dice1 = (int)(Math.random()*6) + 1;
			dice2 = (int)(Math.random()*6) + 1;
			if(dice1 != dice2) {
				System.out.println("주사위1의 숫자 :" + dice1 + "," + dice2);
				
				if(dice1 == dice2) {
				done = false;
			}
			
		}
		*/
			
		
//		  숫자를 0이 나올때까지 입력하고, 0이 나오면 모든 숫자의 합
		/*
		int i=0, sum=0;
		Scanner scan = new Scanner(System.in);
		boolean done = true;
		
		while(done) {
			System.out.print("숫자 입력:");
			i = scan.nextInt();
			sum += i;
			
			if(i == 0) {
				done = false;
				System.out.println(sum);
			}
			
		}
		*/
		
//		숫자를 0이 나올때까지 입력하고, 0이 나오면 모든 숫자의 합, 짝수면 더하고 홀수면 패스고 0일때 종료
		// 석민씨 티칭ㅎㅎㅎㅎ
		/*
		int i=0, sum=0;
		Scanner scan = new Scanner(System.in);
		boolean done = true;
		
		while(done) {
			System.out.print("숫자 입력:");
			i = scan.nextInt();
			
			if(i ==0) {
				System.out.println("짝수들의 합:"+sum);
				done = false;
			}
			else if(i%2 == 0) {
				sum += i;
				System.out.println("짝수입니다.");
			} 
			
			else {
				System.out.println("홀수입니다.");
				continue;
			}
			
		}
		*/
		
		
		
		// 자판기!!
		int pay=0, num=0;
		boolean done=true;
		int coke=0, cider=0, coffee=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입금할 돈: ");
		pay = scan.nextInt();
		
		
		while(done) {
			System.out.println("==============선택==============");
			System.out.println("1, 음료선택   2, 잔액확인   3, 구매확인");
			System.out.println("============0,  종료============");
			num = scan.nextInt();
			switch(num) {
			case 1: //음료선택
				int num2=0;
				System.out.println("1, 콜라(500원)  2, 사이다(700원)  3, 커피(1000원)");
				num2 = scan.nextInt();
				
				if(num2==1) { //콜라선택
					if(pay<500) { //잔액이 없으면!???price[0]
						System.out.println("잔액을 확인하세요.");
						continue;
					}
					else { //잔액이 있다면
						System.out.println("콜라 1잔 구매완료.");
						pay = pay - 500;
						coke++;
					}
				}
				
				else if(num2==2) { //사이다선택
					if(pay<700) { //잔액이 없다면 price[1]
						System.out.println("잔액을 확인하세요.");
						continue;						
					}
					else { //잔액이 있다면
						System.out.println("사이다 1잔 구매완료.");										
						pay = pay - 700;
						cider++;
					}
				}
				
				else if(num2==3) { //커피선택
					if(pay<1000) { //돈없으면  price[2]
						System.out.println("잔액을 확인하세요.");
						continue;												
					}
					else { //돈있으면
						System.out.println("커피 1잔 구매완료.");										
						pay = pay - 1000;
						coffee++;
					}
				}
				
				else { //아니라면!?
					System.out.println("잘못 선택하였습니다.");
					continue;											
				}
				break;

			case 2: //잔액확인
				System.out.println(pay + "원 남았습니다.");
				break;

			case 3: //구매확인
				System.out.println("지금까지 주문한 음료");
				System.out.println("콜라:"+coke+"사이다:"+cider +"커피:"+coffee);
				break;

			case 0: //종료
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

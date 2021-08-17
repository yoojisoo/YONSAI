/*
 * 
 * 석민씨 자판기
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ex3 {


	static Scanner sc = new Scanner(System.in);
	static int money_kind;
	static int how;
	static int kind;
	static int money;
	static String[] kind2 = new String[3];//종류 선언
	static int[] price = new int[3]; //가격표
	static int[] count = new int[3]; //음료 갯수
	static int[] money_k = new int[3];
	

	public static void main(String[] args) {
		kind2[0] ="사이다";
		kind2[1] ="콜라";
		kind2[2] ="커피";
		price[0] = 500;
		price[1] = 500;
		price[2] = 1000;	
		count[
		      
		      0]=5;
		count[1]=5;
		count[2]=5;
		money_k[0] = 1000;
		money_k[1] = 500;
		money_k[2] = 100;
		int choose;
		
		
		boolean done = true;
		
		while(done) {
			
			System.out.println("========갖고있는 금액:"+money+"=======");
			System.out.println("1, 동전투입 2, 음료구매 3,음료갯수");
			System.out.println("=====4, 잔액반환 99, 종료====="); 
			
			choose = sc.nextInt();
			if(choose==1) {
				System.out.println("============동전 투입============");
				System.out.println("1, 1000원   2, 500원   3, 100원");
				System.out.println("==============================");
				money_kind = sc.nextInt();
				
				if(money_kind==1||money_kind==2||money_kind==3) {
					System.out.print("얼마나 넣으시겠습니까: ");
					how = sc.nextInt();
					if(how>0) {
						money = money +( money_k[money_kind-1]*how);
					}
					else {
						System.out.println("잘못 입력하였습니다.");
					}
				}
				else {
					System.out.println("잘못 입력하였습니다.");
				}
			}
			else if(choose ==2) {
				System.out.println("1, "+kind2[0]+"(500원)  2, "+kind2[1]+"(500원)  3, "+kind2[2]+"(1000원)  4,취소");
				kind = sc.nextInt();
				if(kind ==4) {
					System.out.println("취소하였습니다.");
				}
				else if(kind!=1&&kind!=2&&kind!=3) {
					System.out.println("잘못 입력하였습니다. 초기화면으로 이동합니다.");
				}
				if(count[kind-1] != 0) {
					int num;
					System.out.print("몇개 구매: ");
					num = sc.nextInt();
					if(money-(price[kind-1]*num)>=0) {
						if(num>count[kind-1]) {
							System.out.println("현재 "+kind2[kind-1]+"의 재고는"+count[kind-1]+"개 입니다.");
							System.out.println("구매가 불가능합니다.");
						}
						else {
							System.out.println(kind2[kind-1]+""+num+"잔 구매완료.");
							money = money-(price[kind-1]*num);
							count[kind-1] = count[kind-1] - num;               
						}
					}
					else {
						System.out.println("잔액 부족");   
					}
				}
				else {
					System.out.println(kind2[kind-1]+" 모두 팔렸습니다.");
				}
			}
			else if(choose == 3) {
				System.out.println("===지금까지 남은 음료===");
				System.out.println("사이다:"+count[0]+" 콜라"+count[1]+" 커피:"+count[2]);
			}
			else if(choose == 4) {
				System.out.println("반환 금액: "+money);
				money = 0;
			}
			else if(choose == 99) {
				System.out.println("남은금액: "+money);
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하였습니다. 다시입력해주세요.");
			}
		}
	

	}
}

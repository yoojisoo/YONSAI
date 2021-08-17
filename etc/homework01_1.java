package kr.co.job.etc;

import java.util.Scanner;

public class homework01_1 {

	public static void main(String[] args) {
		//선언
		Scanner scan = new Scanner(System.in);
		int num, money = 0;
		boolean done = true;
				
		//입력
		while (done) {
			System.out.println("==================[MENU]=================");
			System.out.print("동전투입 : ");
			money = scan.nextInt();
			System.out.println("음료수 선택");
			System.out.println("1.사이다(500)  2.콜라(500)  3.커피(1000)  4.취소");
			System.out.println("==========================================");
			System.out.print("마실 음료의 번호를 선택하시오 : ");
			num = scan.nextInt();

			//처리 및 출력
			switch(num) {
				case 1: // 사이다(500)일때 / 넣은값의 이상이하?
					int cider = 500;
					while (cider <= money) {
						System.out.println("음료를 가져가세요.");
						System.out.println("거스름 돈 : " + (money - cider) + "원");
						if (cider < money) {
							System.out.println("금액을 추가하세요.");
						}
						break;
					
				    } //while_1
				
								
					
				case 2: // 콜라(500)
					int coke = 500;

				case 3: //커피(1000)
					int cof = 1000;
				
				case 4: //취소
				default: //다른
					
			
			} //switch
				
			
		} //while

	}

}

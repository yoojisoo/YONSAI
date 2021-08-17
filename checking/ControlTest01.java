/*
 * 프로그램의 기본흐름구조 설계하기 
 * ==== 메뉴 ====
 *  1.두 수의 합  2.구구단  3.입력받은 수가지의 합  99.종료
 *  =========================
 *  selct number :
 *  
 */
package kr.co.job.checking;

import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {
		//선언
		Scanner scan = new Scanner(System.in);
		int num=0;
	
		while(true) {
			System.out.println("========[ Menu ]========");
			System.out.println("1.??  2.??  3.??  99.종료.");
			System.out.println("========================");
			System.out.println("숫자 입력 : ");
			num = scan.nextInt();
		
			
			switch(num) {
				case 1: //1번을 눌렀을 때 두 수의 합을 구해줌	
					//선언
					int num1, num2, sum=0;
					//입력
					System.out.print("첫번째 수 : ");
					num1 = scan.nextInt();
					System.out.print("두번째 수 : ");
					num2 = scan.nextInt();
					//처리와 출력
					sum = num1 + num2;
					System.out.println("두 수의 합은 : " + sum);
					
				case 2: //2번을 눌렀을 때 구구단이 나옴
					//선언
					int i=0;
					
				} //switch
			} //whille

		
	} //

} //

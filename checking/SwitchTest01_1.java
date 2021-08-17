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

public class SwitchTest01_1 {

	public static void main(String[] args) {

		//선언
		Scanner scan = new Scanner(System.in);
		int num=0;
		boolean done = true;
		//입력
		while(done) {
			System.out.println("==========[ Menu ]==========");
			System.out.println("1.두 수의합 | 2.구구단 | 3.입력받은 수 까지의 합 | 99.종료");
			System.out.println("============================");
			System.out.println("selct number : ");
			num = scan.nextInt();
			
			//처리와 출력
			switch(num) {
				case 1: //두 수의 합
					int num1, num2, sum=0;
					
					System.out.print("first number : ");
					num1 = scan.nextInt();
					System.out.print("Second number : ");
					num2 = scan.nextInt();
					
					sum = num1 + num2;
							System.out.println(sum);
					break;
				
				case 2: //구구단
					int dan=0;
					int result=0;
					
					System.out.println("단을 입력하세요 : ");
					dan = scan.nextInt();
					
					for(int i=1; i<=9; i++) {
						result = dan*i;
						System.out.println(dan + " * " + i + " = " + result);
					
					 }
					break;
				case 3: //입력받은 수 까지의 합
					int num3, num4=0;
					int result2=0;
					int sum2=0;
					
					int a;
					
					System.out.print("00수에서 ");
					num3 = scan.nextInt();
					System.out.print("00까지");
					num4 = scan.nextInt();
					
					//처리

	
					
					while(num3!=num4+1) {//num3 == num4  종료  
						System.out.print(num3+"+");
						sum2 = sum2+num3; 
						num3++;
					}
					
//					for(int i=num3; i<=num4; i++) {
//						sum2 = sum2+i;
//						
					System.out.println( "=" + sum2); // 이 프린트가 괄호 안에 있으면 과정이 보임
//					}
				
					
					
				case 99: //종료
					
				default:
						


				
			} //switch
			
			
		} //whille

		
		
		
		

	} // end

} // end

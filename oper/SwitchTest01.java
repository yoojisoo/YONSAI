package kr.co.job.oper;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		boolean done = true; // done이 참이면 실행, 거짓이면 종료 // 상태를 표시하는것 !!!
		
		
		while(done) {
			System.out.println("========[ Menu ]========");
			System.out.println("1.??  2.??  3.??  99.종료.");
			System.out.println("========================");
			System.out.println("숫자 입력 : ");
			num = scan.nextInt();
			
			switch(num) {
			 case 1:
				 System.out.println("1입니다.");
				 break;
			 case 2:
				 System.out.println("2입니다.");
				 break;
			 case 3:
				 System.out.println("3입니다.");
				 break;
			 case 99:
				 System.out.println("반복을 종료합니다.");
				 done = false; // 예제 때 맨 마지막에 넣었다~~
				 break;
			 default :
				 System.out.println("누구냐 넌!~");
				 break;
			}
			
		}
		
		

	} //

} //

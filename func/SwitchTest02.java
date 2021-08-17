package kr.co.job.func;

import java.util.Scanner;

public class SwitchTest02 {

	/*
	 * 함수 즉 메소드에 대해 이해해보기
	 */
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// stastic(정적) : 메모리에 로드됨(고정됨)
		int num = 0;
		boolean done = true; // done이 참이면 실행, 거짓이면 종료 // 상태를 표시하는것 !!!
		
		
		while(done) {
			//메뉴출력 및 
			
			
			num = menuPrint();
			
			switch(num) {
			 case 1: //두수의 합
				sumTest();

				 
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

	private static void sumTest() { // 이름적고 (); <--이거 두개 써주구  
		 System.out.println("1입니다. : 두수의 합");
		 int n1=3, n2=5, sum=0;
		 sum= n1 + n2;
		 System.out.println("합 구하기 끝");
		
	}

	//메뉴 출력하는 함수
	private static int menuPrint() { //프라이빗. 이 클래스에서만 쓰는것 ^0^~~~~~~~~~
		System.out.println("========[ Menu ]========");
		System.out.println("1.??  2.??  3.??  99.종료.");
		System.out.println("========================");
		System.out.println("숫자 입력 : ");
		
		return scan.nextInt();
		
	}

} //

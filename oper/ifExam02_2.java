/*
 * 키보드로 두 수를 입력 받아서 결과값 도출
 */

package kr.co.job.oper;

import java.util.Scanner;

public class ifExam02_2 {

	public static void main(String[] args) {
		// 선언 : 키보드와 변수
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = null; //스트링 대문자!!
				
		//입력
		System.out.println("num1을 입력하시오");
		num1 = scan.nextInt();

		System.out.println("num2를 입력하시오");
		num2 = scan.nextInt();
				
		//처리와 출력
		if(num1 < num2) {
//			System.out.println("num1은 num2보다 작다");
			result = "num1은 num2보다 작다"; //세미콜론 빼먹지말기!!
					}
	
		else {
//			System.out.println("num1은 num2보다 크다");
			result = "num1은 num2보다 크다";
					}
		//result로 하는거 어케 하는겨????????
		
		System.out.println("제발~~ 맞게 출력되나요??? 끝!!");
		
		/*
		 * 다중if
		 *  if(){
		 *        A
		 *  }
		 *  else if()
		 *         B
		 *  }
		 *  else{
		 *         C
		 *  }
		 *
		 */

		
		
	}//end of main()

}//end of class

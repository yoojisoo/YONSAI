/*
 * 키보드로 두 수를 입력 받아서 큰지 작은지 비교하는 프로그램을 작성
 * 
 */

package kr.co.job.oper;

import java.util.Scanner;

public class ifExam02 {

	public static void main(String[] args) {
		//선언부 : 키보드와 변수
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		// 입력
		System.out.println("num1을 입력하시오");
		num1 = scan.nextInt();
		
		System.out.println("num2를 입력하시오");
		num2 = scan.nextInt();
		
		// 처리
		if(num1 > num2) {
			// 조건이 참(크다)일 때
			System.out.println("num1은 num2보다 크다");
		}
		
		else {
			// 조건이 거짓(작다)일 때
			System.out.println("num1은 num2보다 작다");
		}
		
		System.out.println("제발 성공적으로 끝났나요??");


		
	}

}

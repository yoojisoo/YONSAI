/*
 * 에러와 오류?
 * 
 * 
 */
package kr.co.job.object;

import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 선언부
		int n1 = 5, n2 = 6;
		Calc c = new Calc();
		// 두수를 더하세요
		System.out.println("두 수의 합 : "+c.sum(n1, n2));
		//두수를 나누세요
		try {
			System.out.println("두 수를 나누기 : "+c.div(n1, n2));			
		}catch(Exception e) {
			System.out.println("산술오류");
			e.printStackTrace();
		}finally {
			System.out.println("5");
		}
		System.out.println("End");

//		c.div(n1, n2); //Calc에 throws Exception 달아놓으면 저절로 컴파일 뜸. 둘중 하나 선택하여 예외처리.
		
	}

}

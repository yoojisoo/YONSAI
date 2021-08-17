/*
 * 다양한 for문들
 * 1. 시작값 끝값까지 입력받아 모든 홀수의 합
 * 1+2+3...+10 = 55
 */

package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startValue, lastValue;
		
		System.out.print("시작값 입력 :");
		startValue = scan.nextInt();

		System.out.print("끝값 입력 :");
		lastValue = scan.nextInt();
		
		//처리 : 모든 홀수만 출력
		for(int i=startValue; i<=lastValue; i++ ) {
			if(i%2 == 1) {  // i%2 != 0
				System.out.print(i + " ");
			}
		}
	
		
		
		

	} //

} //

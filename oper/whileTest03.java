/*
 * p170 : 입력받은 숫자의 각 자리의 합 구하기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class whileTest03 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. (예:12345)>");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine(); // nextLine이 문자열
		num = Integer.parseInt(tmp); // 문자를 정수로 바꿔주는 함수
//		num = Integer.parseInt(scan.nextLine()); 원래 이런 한줄짜리
// 345	=>34	=>3
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10;  // sum = sum + 5        // sum = sum + num%10
			System.out.println("sum="+sum + "  num="+ num);
			
			num /= 10;  // num = num /10; num을 10으로 나눈 값을 다시 num에 저장 
			
						
		}
		System.out.println("각 자리수의 합:"+sum);

	}

}

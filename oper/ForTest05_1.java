package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05_1 {

	public static void main(String[] args) {
		// 1+2+3+...=55

//		int sum=0;
//		
//		for(int i=1; i<=10; i++) {
//			sum = sum + i;
//			System.out.print(i);
//			
//			if (i != 10)
//				System.out.print("+");
//			else
//				System.out.print("");
//		}
//		System.out.println("=" +sum);
		
		
	      //num1 부터 num2까지  짝수들의 합 구하기
	      
	      //선언
	      int num1, num2;
	      int sum=0;
	      Scanner scan = new Scanner(System.in);
	      
	      //입력
	      System.out.print("첫번째 값 입력: ");
	      num1 = scan.nextInt();
	      System.out.print("두번째 값 입력: ");
	      num2 = scan.nextInt();
	      
	      //연산
	      for(int i = num1;i<=num2; i++) {
	         if(i%2 == 0) {//i의 나머지가 0일경우 = 짝수일 경우
	            sum += i;  // sum = sum+i   출력해야하는 최종값 sum에다가 짝수들(i)를 계속 더하기
	            System.out.print(i); //짝수들 보여주기
	            if(num2-1==i || num2==i) { 
	               // 마지막 값을 홀수(5) 입력시 ex) 5-1 == 4 가되고, 마지막 짝수인 4가 i가 될 때는 +가 아닌 = 출력   
	               // 또는 마지막 값을 짝수(4)로 입력시 ex)4==4가 되고, 마지막 짝수인 4와 4일 경우에는 +가 아닌 = 출력  
	               System.out.print("=");
	            }
	            else {
	               //그외의 모든 짝수들은 +로 출력
	               System.out.print("+");
	            }
	         }
	      }
	      
	      //출력
	      System.out.print(sum);
		
		
	} //

} //

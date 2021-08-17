package kr.co.job.func;

import java.util.Scanner;

public class ExamFunction03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//두 수를 키보드로 입력받아서 합 메소드에 결과값을 받아 출력하기
		int sum=0, n1=0, n2=0;
		
		scan.next();
		System.out.println("첫수 :");
		n1 = scan.nextInt();
		System.out.println("이수 :");
		n2 = scan.nextInt();
		
		sum = sumTwo(n1, n2);
		System.out.println("합은"+sum);
		System.out.println("합은2"+sumTwo(n1, n2));
		

	}

	
	static int sumTwo(int n1, int n2) {
		return n1+n2;
		
	}
	
	
} //end

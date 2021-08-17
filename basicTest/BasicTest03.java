package kr.co.job;

import java.util.Scanner;

public class BasicTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//선언
		int num1 = 0;
		int num2 = 0;
	    int result = 0;
	    
	    Scanner scan; // 선언
	    scan = new Scanner(System.in); // 생성
	         
	    System.out.println("First number : ");
	    num1 = scan.nextInt();
	    
	    System.out.println("Second number : ");
	    num2 = scan.nextInt();
	    
	    //처리
	    result = num1 + num2;
	    
	    System.out.println("결과값" + result);
	  
	    

	}

}

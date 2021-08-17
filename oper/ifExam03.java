/*
 * 점수를 입력받아서 성적(A~F)을 출력하세요
 * 
 * 성적을 보관 어떻게 하지!? 문자 1개인데!? char로
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ifExam03 {

	public static void main(String[] args) {
	      int score = 0; // 점수
	      Scanner scan = new Scanner(System.in);
	      char ch = 'Z'; 
	      char buho = '0';
	    		  
	      System.out.print("점수 입력 : ");
	      score = scan.nextInt();
	      
	      	      
	      if(score >= 90 && score <=100) {  //90이상이면
	         ch = 'A';
	         
	      }else if(score >= 80){  // 80이상이면
	    	 ch = 'B';
	    	  
	      }else if(score >= 70){  // 70이상이면
	    	 ch = 'C';
	    	  
	      }else if(score >= 60){  // 60이상이면
	    	 ch = 'D';
	    	  
	      }else {   // 60미만
	    	 ch = 'E';
	      }
	      
	      	      
	      System.out.println("Program End!");
	   }


}

/*
 * 점수를 입력받아서 성적(A~F)을 출력하세요
 * 
 * 성적을 보관 어떻게 하지!? 문자 1개인데!? char로
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ifExam03_1 {

	public static void main(String[] args) {
	      int score = 0; // 점수
	      Scanner scan = new Scanner(System.in);
	      char ch = 'Z'; 
	      char buho = '0';
	    		  
	      System.out.print("점수 입력 : ");
	      score = scan.nextInt();
	      	      
	      if(score >= 90 && score <=100) { //90이상이면
	    	  ch = 'A';
		      if(score >= 97) {
		    	 buho = '+';
		      }else if(score <= 93) {
		         buho = '-';
		      }
	      }      	        		 
	      else if(score >= 80) {  // 80이상이면
	    	 ch = 'B';
		       if(score >= 87) {
		    	 buho = '+';
		      }else if(score <= 83) {
		    	 buho = '-';
		      }
	      }	    	  
	      else if(score >= 70) {  // 70이상이면
	    	 ch = 'C';
		      if(score >= 77) {
		    	  buho = '+';	    			 
		      }else if(score <= 73) {
		    	  buho = '-';
		      }
	      } 
	      
	      else if(score >= 60) {  // 60이상이면
	    	 ch = 'D';
	    	 if(score >= 67) {
	    	  buho = '+';	    			 
	    	 }else if(score <= 63) {
	    	  buho = '-';
	    	 }
	      }	    	 
	      else {   // 60미만
	    	 ch = 'E';
		  }
	      
	       	 	      	      	      
	      System.out.println("당신의 점수는" + score + "점이고, 성적은" + ch + buho + "입니다");
	      System.out.println("Program End!");
	  
	}
	       


 }

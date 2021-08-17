package kr.co.job.etc;

import java.util.Scanner;

public class StarExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        for(int i=0; i<b; i++){            
//            for(int j=0; j<a; j++){
//            	System.out.print("*");
//            }
//            System.out.println();
//       
//        }
//        
//		int a = sc.nextInt();
//        int b = sc.nextInt();
//        String star = "";
//        for(int i=1; i<=a; i++){
//            star = star + "*";
//        }
//        for(int i=1; i<=b; i++){
//            System.out.println(star);
//        }
		
		int a = 0;
		int b = 3;
		
		if(a>b) {
			System.out.println(">");
		}
		
		else if(a<b) {
			System.out.println("<");
		}
		
		else {
			System.out.println("==");
		}

		
	}

}

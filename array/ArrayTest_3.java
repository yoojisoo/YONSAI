/*
 * 다섯명의
 * 국어 수학 영어 총점 평균
 */
package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest_3 {

	public static void main(String[] args) {
		int korTotal=0;
		int engTotal=0;
		int mathTotal=0;
		int[][] score = new int[5][3];
		//         국어   영어  수학
//		score = {{100, 100, 100},
//				{20, 20, 20},
//				{30, 30, 30},
//				{40, 40, 40},
//				{50, 50, 50}};

		for(int j=0; j<score[0].length; j++) { //배열에 점수넣기
			score[0][j] = 100;
			score[1][j] = 20;
			score[2][j] = 30;
			score[3][j] = 40;
			score[4][j] = 50;
		}
		
		System.out.println(" 번호  국어  영어  수학  총점  평균 ");
		System.out.println("==============================");
		

		for(int i=0; i<score.length; i++) {
			System.out.printf("%3d", i+1);	
			
			korTotal = korTotal + score[i][0]; //국어총점
			engTotal = engTotal + score[i][1]; //영어총점
			mathTotal = mathTotal + score[i][2]; //수학총점			
			
			int sum=0;
			float avg=0.0f;

			for(int j=0; j<score[i].length; j++) {				
				sum = sum + score[i][j];//개인총점
				System.out.printf("%5d", score[i][j]);	
			}	

			avg = sum/(float)score[i].length;//개인총점	
			System.out.printf("%5d %5.1f%n", sum, avg);		
		}					
		
		
		System.out.println("==============================");
		System.out.printf("총점 : %3d  %3d  %3d", korTotal, engTotal, mathTotal);
		
//		System.out.println("----------------------");
//		int result = (int)(Math.random()*10);
//		System.out.println(result);
		
		


	
		
	}

}

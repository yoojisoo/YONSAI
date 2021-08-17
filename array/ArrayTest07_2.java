package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest07_2 {

	public static void main(String[] args) {
		// 2차원 배열을 이해하자
		int[][] score = {
//				국어    영어  수학  
				{100, 100, 100},  //(0,0) (0,1) (0,2)
				{20, 20, 20},     //(1,0) (1,1) (1,2)
				{30, 30, 30},     //(2,0) (2,1) (2,2)
				{40, 40, 40},     //(3,0) (3,1) (3,2)
				{50, 50, 50},     //(4,0) (4,1) (4,2)
		};
		int korSum = 0;
		int engSum = 0;
		int matSum = 0;
		int korAverage = 0;
		int engAverage = 0;
		int matAverage = 0;
		
		// i : 행(줄)-학생   j : 열(칸)-국어,영어,수학
		for(int i=0; i<score.length; i++) { //score.length가 5 (행의 길이)
			System.out.println("행 ================");
//			<이 자리에 넣으면 됨 korSum,engSum,matSum>
			
			for(int j=0; j<score[i].length; j++) {
				System.out.print("score["+i+"]["+j+"]="+score[i][j]+"  ");
		
			}
			System.out.println();
			
		}
		
		for(int i=0; i<score.length; i++) { //score.length가 5 (행의 길이)
			korSum = korSum + score[i][0];
			engSum = engSum + score[i][1];
			matSum = matSum + score[i][2];					
			korAverage = korSum/score.length; 
			engAverage = engSum/score.length; 
			matAverage = matSum/score.length; 
			}
	
	
		System.out.println("국어 평균 = "+korAverage);
		System.out.println("영어 평균 = "+engAverage);
		System.out.println("수학 평균 = "+matAverage);
		System.out.println("국어 점수 합 : "+korSum);
		System.out.println("영어 점수 합 : "+engSum);
		System.out.println("수학 점수 합 : "+matSum);
		
		
		
		

	} //

} //

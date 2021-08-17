package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest07 {

	public static void main(String[] args) {
		// 2차원 배열을 이해하자
		int[][] score = {
//				국어    영어  수학  
				{ 100, 100, 100 }, // (0,0) (0,1) (0,2)
				{ 20, 20, 20 }, // (1,0) (1,1) (1,2)
				{ 30, 30, 30 }, // (2,0) (2,1) (2,2)
				{ 40, 40, 40 }, // (3,0) (3,1) (3,2)
				{ 50, 50, 50 }, // (4,0) (4,1) (4,2)
		};
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		System.out.println("번호  국어  영어  수학  총점   평균 ");
		System.out.println("==============================");

		for (int i = 0; i < score.length; i++) { // score.length가 5 (행의 길이)
			int sum = 0; // 개인별 총점
			float avg = 0.0f; // 개인별 평균

			korTotal = korTotal + score[i][0];
			engTotal = engTotal + score[i][1];
			mathTotal = mathTotal + score[i][2];

			System.out.printf("%3d", i + 1);

			for (int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
				System.out.printf("%5d", score[i][j]);
			}

			avg = sum / (float) score[i].length; // 평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("==============================");
		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);

		
	} //

} //

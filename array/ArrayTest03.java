package kr.co.job.array;
import java.util.*;
public class ArrayTest03 {

	public static void main(String[] args) {
		
		int sum=0;
		float avg=0f;
		int min=0, max=0;
		int max2=0;
		
		String[] a = {"hi","abc","j"};
		int[] score = {55, 88, 96, 100, 90, 85, 75, 11, 5};
		
		
	
				
		
		Arrays.sort(score); // 배열 0~000 순차정리
		Arrays.sort(a);
		
		 
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
//		for(int i =0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
		
		min = score[0];
		max2 = score[score.length-1];
		
		//해당배열에서 최대값과 최소값을 구하세요.
//		for(int i=0; i<score.length; i++) {
//			if(max < score[i]) {
//				max = score[i];
//			}
//		}
		
		System.out.println("최대값은="+max2);
//		
//		for(int i=0; i<score.length; i++) {
//			min=max;
//			if(min > score[i]) {
//				min = score[i];
//			}
//		}
		
		System.out.println("최소값은="+min);
		
		
		
		/* 최소값 최대값 선생님 정리
		 min=score[0]; // 선언을 아예 0의 자리부터 해버리니까 for문의 i는 1부터~ 아예 이렇게 정하면 편함.
		 max=score[0];
		 
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		 */
		
		

		System.out.println("-----------------------------------");
		//합구하기
		for(int i=0; i<score.length; i++) {
			sum = sum + score[i];
		}
		
		//평균
		avg = sum / (float)score.length;
		
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
		
	}

}

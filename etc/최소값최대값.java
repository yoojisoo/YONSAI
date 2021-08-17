package kr.co.job.etc;

public class 최소값최대값 {

	public static void main(String[] args) {
//		int[] score = {79,88,91,33,100,55,95};
//		int mini= score[0];
//		int max = score[0];
//		
//		for(int i=0; i<score.length; i++) {
//			if(mini > score[i]) {
//				mini = score[i];
//			}
//			else if(max < score[i]) {
//				max = score[i];				
//			}
//		}
//		System.out.println("최소값 : "+mini+" "+"최대값 : "+max);
//		
		int[] score = {79,88,91,33,100,55,95};
		int mini= 0;
		int max = 0;
		
		for(int i=0; i<score.length; i++) {
			if(mini > score[i]) {
				mini = score[i];
			}
			else if(max < score[i]) {
				max = score[i];				
			}
		}
		System.out.println("최소값 : "+mini+" "+"최대값 : "+max);

	}

}

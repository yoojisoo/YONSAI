package kr.co.job.oper;
/*
 *  배열 arr은 숫자로 이루어져있다.
 *  arr의 평균값을 출력해라.
 */
public class AverageArray {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6};
		int sum=0;
		double avg=0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		avg = (sum/(double)arr.length); //^^ㅎㅎ
		System.out.println((double)avg);
		
		
		
	}

}

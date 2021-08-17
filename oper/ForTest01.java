/*
 * 기본적인 for문
 * for(초기값; 조건; 증감치){     //증감치가 맨 마지막(1초기값2조건3실행문4증감치2다시조건값으로)
 * 		실행문
 * }
 */

package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		int i =0;
		for(i=1; i<3; i++) {
			System.out.println("반복변수 i값 : " + i);
		}
		System.out.println("for문 종료 후 반복변수 i값 :" + i);
		
	
		

	} // end of main()

} // end class

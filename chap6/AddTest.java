/*
 * 두 정수를 구하는 메소드
 * 두 실수를 구하는 메소드
 * 세 정수를 구하는 메소드
 * 세 실수를 구하는 메소드
 * 
 */
package kr.co.job.chap6;

public class AddTest {

	public int Sum(int n1, int n2) {
//		int result = num1+num2;
//		return result;
		return n1+n2;
	}
	public int Sum(int n1, int n2, int n3) { //이렇게 이름 같을수있음-메소드의 다형성
		return n1+n2+n3;
	}
	public float Sum(float n1, float n2) { //변수명도 똑같아도 되네-메소드의 다형성
		return n1+n2;
	}
	public float Sum(float n1, float n2, float n3) {
		return n1+n2+n3;
	}
//	public float floatSum(float num3, float num4) {
//		float result = num3+num4;
//		return result;
//	}
//	public int intSumThree(int num5, int num6, int num7) {
//		int result = num5+num6+num7;
//		return result;
//	}
//	public float floatSumThree(float num8, float num9, float num10) {
//		float result = num8+num9+num10;
//		return result;
//	}
	
	
	
	
}

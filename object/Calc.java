/*
 * 더하기 곱하기 빼기 나누기등의 메소드를 모아놓은 클래스
 */
package kr.co.job.object;

public class Calc {
	public int sum (int n1, int n2) {
		int result = n1 + n2;
		
		return result;
	}
	
//	public int div (int n1, int n2) throws Exception {
//		int result = n1 / n2;
//		
//		return result;
//	}
	
	public int div (int n1, int n2) throws Exception{ //이렇게 if문으로 안되는거 먼저 처리하면 if문 간소화.
		if(n2==0) {
			throw new Exception("0으로 나누면 안돼요"); //이렇게 new로 단발성으로 하면 메모리에 도움이된다.
		}
		int result = n1 / n2;
		
		return result;
	}
	

}

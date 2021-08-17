/*
 * 두 수를 입려받아서 더하기, 빼기, 곱하기, 나누기를 구하는 메소드 
 * void plusV(int n1, int n2);
 * minusV(), mulV(), divV() => 메소드(함수) 이름
 * 
 */
package kr.co.job.func;

public class EaxmFunction02 {

	public static void main(String[] args) {

		// 3,5의 합 구하기
		int sum=plusV(3,5);
		System.out.println("3과 5의 합 : "+sum);
	
		// 3,10b의 뺄셈
		minusV(5,8);
		
		//5,4의 곱셈
		mulV(10,7);
		
		//2,8의 나눗셈
		divV(5,6);

	}


	private static int plusV(int n1, int n2) { //합
		// TODO Auto-generated method stub
		 System.out.println(n1+n2);
		 return n1+n2;
	}//end
	
	private static void minusV(int i, int j) { //뺄셈
		// TODO Auto-generated method stub
		System.out.println(i-j);
	}

	private static void mulV(int i, int j) { //곱셈
		// TODO Auto-generated method stub
		System.out.println(i*j);
	}

	private static void divV(int i, int j) { //나눗셈
		// TODO Auto-generated method stub
		System.out.println(i/j);	
	}





}

package kr.co.job.etc;
import java.util.*;
import java.math.*;
public class Twinkle_little_star {
	
	public static void main(String[] args) {

	//00의 단 구하기
	Scanner scan = new Scanner(System.in);
	int result=0, dan=0;
	
	System.out.println("-----------원하는 단의 수 출력하기--------");
	System.out.print("단 수를 입력하세요 : ");
	dan=scan.nextInt();
	for(int i=1; i<9; i++) {
		result = dan*i;
		System.out.println(dan+" * "+i+" = "+result);
	} //ean for

	//------------------------------------------------------------
	//2단에서 9단까지
	System.out.println("-----------2단에서 9단까지 보기------------");
	int dann=0;
	int resultTwo=0;
	
	for(dann=2; dann<=9; dann++) {
		for(int i=1; i<=9; i++) {	
			resultTwo = dan*i;
			System.out.println(dann+"*"+i+"="+resultTwo);
		}
	}
	
	
	
	} //end of main
	
} //end class

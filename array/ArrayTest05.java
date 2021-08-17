package kr.co.job.array;

import java.util.Scanner;

public class ArryTest05 {

	public static void main(String[] args) {
		
		final int SIZE=5; //final==고정된 변수. 대문자 사용
		String[] name = new String[SIZE];
		Scanner scan = new Scanner(System.in);
		
		//이름입력받기
		for(int i=0; i<SIZE; i++) {
			System.out.print((i+1)+"번째 이름을 입력해주세요 : ");
			name[i]=scan.next();
		}
		
		//배열값 하나 출력하기
		int n=0;
		n=(int)(Math.random()*6);
			System.out.println("이름 : "+name[n]);
			
	
//		

	}

}

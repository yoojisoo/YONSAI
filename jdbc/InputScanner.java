package kr.co.job.jdbc;

import java.util.Scanner;

public class InputScanner {
	Scanner scan;
	
	InputScanner(){
		scan = new Scanner(System.in);
	}
	
//	숫자만 입력받는 함수
	int onlyInt() {
		int num = 0;
		do {
			System.out.println("숫자입력 : ");
			num = Integer.parseInt(scan.next());
		}while(num<48 || num > 57);//숫자아님
		
		return num;
	}

}

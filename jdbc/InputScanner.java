package kr.co.job.jdbc;

import java.util.Scanner;

public class InputScanner {
	Scanner scan;
	
	InputScanner(){
		scan = new Scanner(System.in);
	}
	
//	���ڸ� �Է¹޴� �Լ�
	int onlyInt() {
		int num = 0;
		do {
			System.out.println("�����Է� : ");
			num = Integer.parseInt(scan.next());
		}while(num<48 || num > 57);//���ھƴ�
		
		return num;
	}

}

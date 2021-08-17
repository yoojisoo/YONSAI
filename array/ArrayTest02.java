package kr.co.job.array;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 문자열 배열 5개를 선언한 후 5명의 이름을 입력받으세요
		String[] name;
		name = new String[5]; //<<필요할때 활성화
		
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<name.length; i++) { // <=에서 =를 넣고싶으면 -1을 해야한다. / 배열의 총길이5와 인덱스 5칸(0~4)의 차이
			System.out.print((i+1) + "번째 이름을 입력해주세요 : ");
			name[i]=scan.nextLine();
		}
		
		for(int i=0; i<name.length; i++) { //확인용
			System.out.println("name["+(i+1)+"]번째 이름 : " + name[i]);			
		}

		
		
	}

}

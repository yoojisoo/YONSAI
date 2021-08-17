/*
 * 나이를 입력받아서 60세 이상이면 "노인",
 * 30세 ~ 59세면 "중장년",
 * 29세 미만이면 "청소년"를 표현 하세요.
 */


package kr.co.job.oper;

import java.util.Scanner;

public class ifExam04 {

	public static void main(String[] args) {
		//선언
		Scanner scan = new Scanner(System.in);
		int age = 0;
		String 연령층 = "중장년";
		
		//입력
		System.out.print("나이를 입력 하시오 : ");
		age = scan.nextInt();
								
		//처리
		if(age > 60){
			연령층 = "노인";
		}else if(age < 30){
			연령층 = "청소년";
		}
		
		//출력
		System.out.println("당신의 나이는 " + age + "이고, 연령층은 " + 연령층 + "입니다.");
		
		
	} //end main

} // end class

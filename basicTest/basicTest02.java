/* 두 정수를 키보드로 입력받아서
 * 결과값을 출력하세요
 * 
 * 키보드 입력절차
 * Scanner scan = new Scanner(); // 키보드 클래스- scan으로 생성
 * num = scan.next();
 */

package kr.co.job;

import java.util.Scanner;

public class basicTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 동작하기위해 해당 클래스에 객채(scan) 생성합니다.
        Scanner scan = new Scanner(System.in);
        int num =0;
        
        System.out.print("Input press : ");
        num = scan.nextInt();
        
        System.out.println("입력받은 정수 :" + num);




	}

}

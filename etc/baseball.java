/*
 * 숫자 야구 해보자~
 * 1.랜덤으로 정해진 숫자 3개와 사용자 입력 숫자 3개 비교
 * 2.같은자리에 숫자 맞추면 Strike
 * 3.숫자를 맞췄지만, 위치가 다르면 Ball
 * 4.번호와 위치가 다 틀리다면 Out
 * 5.세자리의 숫자를 맞추면 종료
 */
package kr.co.job.etc;
import java.util.*;
public class baseball {

	public static void main(String[] args) {
		// 선언
		Scanner scan = new Scanner(System.in);

		int[] rand = new int[3];
		int[] userNum = new int[3];
		int count = 0;
		int strike = 0;
		int ball = 0;
		boolean done = true;
			
		//for문으로 랜던값 0이 아니게, 중복 안되게 계속 돌리기
			while(rand[0]==0) {
				rand[0] = (int)(Math.random()*9)+1;
			}
			while(rand[1]==0) {
				rand[1] = (int)(Math.random()*9)+1;
				if(rand[1] == rand[0]) {
					rand[1]=0;
				}
			}
			while(rand[2]==0) {
				rand[2] = (int)(Math.random()*9)+1;
				if(rand[2] == rand[0] || rand[2] == rand[1]) {
					rand[2]=0;
				}
			}
			System.out.printf("랜덤값 : %s %s %s\n",rand[0],rand[1],rand[2]); //이게 싫으면 for문으로 !!
			
			//사용자의 입력을 for문으로 배열 나누기
			while(done) {
				System.out.print("숫자입력 : ");
				System.out.println("당신의 볼: "+ball);
				System.out.println("당신의 스트라이크: "+strike);
				String user=scan.nextLine();
				for(int i=0; i<3; i++) { //'0'은 아스키코드를 빼는것
					userNum[i]=user.charAt(i)-'0';
				}
				//사용자입력과 랜던값 비교하기
//				for(int i=0; i<3; i++) { 
//					
//					// for 문 2개써야해요
//					if(rand[0]==userNum[0] || rand[1]==userNum[1] || rand[2]==userNum[2]) { //다맞으면
//						strike++;
//						System.out.println("스트라이크!");		
//						
//					}
//					if(rand[i]!=userNum[i] && rand[i]==userNum[1] || rand[i]==userNum[2]) { //하나라도 맞으면
//						System.out.println("스트라이크");					
//					}
//					
//					else if(rand[i]!=userNum[0] && rand[i]!=userNum[1] && rand[i]!=userNum[2]) { // 다 안맞으면
//						System.out.println("파울");
//						
//					}
//					else {
//						System.out.println("다시 시도하세요.");
//						count++;
//					}
//					if(strike==3) {
//						done = false;
//					}
//				}
				for(int i =0; i<3; i++) {
					for(int j=0; j<3; j++) {
						
					}
				}
			}
			
			
			
			
			
	} // end of main()

} // end class

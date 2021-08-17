/*
 *[메소드 호출] 
 * 기능 : 특정문자를 횟수만큼 출력하는 메소드 만들기
 * void printCharacter(char ch, int num); 메소드원형 (한수원형)
 * 
 */

package kr.co.job.func;

public class ExamMethod01 {

	public static void main(String[] args) {
		printCharacter('*',4);
		printCharacter('$',7);
		printCharacter("hello",3);
		printCharacter("world",5);

	} //end of main()

//------------------------------------------------------------------------------------------------
	private static void printCharacter(char ch, int num) {
		System.out.println("반복출력 임무 시작");
		for(int i=1; i<num; i++) {
			System.out.println(ch);
		}
		System.out.println("\n반복출력 임무 종료");
		
	} //printCharacte character형 // 이름은 같은데 타입이 다른것 "다형성"
	
	
	private static void printCharacter(String str, int num) {
		System.out.println("자료형 스트링 출력");
		for(int i=1; i<num; i++) {
			System.out.println(str);
		}
		System.out.println("\n자료형 스트링 종료");
		
	} //printCharacte String형

} // end class

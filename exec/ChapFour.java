package kr.co.job.exec;

import java.util.Scanner;

public class ChapFour {

	public static void main(String[] args) {
//	문제풀이 -----------------------------------------------------------------------------------------

		/*
	[4-7]<끝> Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
		 */
//		int value = (int)(Math.random()*6)+1;
//		System.out.println(value);
		
		
		/*
	[4-9]<끝> 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력이 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
		 */
//		String str="12345";
//		int sum=0;
//		
//		for(int i=0; i<str.length(); i++) {
//			sum = sum+str.charAt(i)-'0';
//		}
//		
//		System.out.println("sum="+sum);
		
//		String str="12345";
//		int i=0, sum=0;
//				
//		while문으로 바꾸기
//			while(i<str.length()) {
//				sum = sum + str.charAt(i)-'0';				
//				i++;
//			}
//		System.out.println("sum="+sum);
		
		/*
	[4-8]<끝> 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		 */
		 		 
//		 for(int x=0; x<=10; x++) {
//			 for(int y=0; y<=10; y++) {
//				 if(2*x+4*y==10) {
//					 System.out.println("x="+x+", y="+y);
//				 }
//			 }
//		 }
		 
				 
		/*
	[4-14]<끝> 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
	사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
	게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
		 */
		
//		Scanner scan = new Scanner(System.in);
//		int answer=0;
//		answer = (int)(Math.random()*100)+1;
//		int input=0; //사용자입력을 저장할 공간
//		int count=0; //시도횟수를 세기위한 변수
		
//		System.out.println(answer);
//		
//		do {
//			System.out.println("1과 100사이의 값을 입력하세요 :");
//			input = scan.nextInt();
//			count++;
//			
//			if(input<answer) {
//				System.out.println("더 큰 수를 입력하세요.");
//			}
//			else if(input>answer) {
//				System.out.println("더 작은 수를 입력하세요.");					
//			}
//			else if(input==answer) {
//				System.out.println("맞췄습니다.");					
//				System.out.println("시도횟수는"+count+"번 입니다.");
//				break;
//			}
//			else {
//				System.out.println("잘못 입력하였습니다.");
//			}
//				
//		}
//		while(true); //무한반복문
		
//	[4-15]다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란 숫자를 거꾸로 읽어도
//		 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다.
//		 (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//		 회문수 : 역순도 같습니다.
		
		int number =13531;
		String str = ""; // number => 문자열로 변경
		String str2 = ""; // 변경한 문자열을 역순으로 저장(대입)
		
		// number => 문자열로 변경한다.str
		str = String.valueOf(number);

		// 변경한 문자열을 역순으로 저장(대입)한다. str2
		for(int i=str.length()-1; i>=0; i--) {	
			str2=str2+str.charAt(i);			
		}
		System.out.println(str2+" : 대입값");
		
		if (str.equals(str2)) {
			System.out.println(number+" 는 회문수입니다.");
		}
		else {
			System.out.println(number+" 는 회문수아닙니다.");			
		}
		
//		채연씨설명 ---------------------------------------------------------------------------
//		포문 안에는 str2 라는 변수 안에 str[i] 값을 넣어주면서 역순으로 저장시키는건데
//		문자열 같은 경우에는 +을 이용하게 되면 '가 + 나 = 가나' 이런식으로 되는거라서
//		str2 = str2 + str.charAt(i); 라고 정의한다면 포문이 계속 돌아가면서 역순으로 저장되는 원리에요!
//		str2 = str2 + str.charAt(i);  이걸 줄여서 쓰면 str2 += str.charAt(i); 라고 표현 할 수도 있어용
//		str.charAt(i)==str; 라고 적으신 의미는 해석하자면 str.charAt(i)은 str와 같다 라는 의미에요
		
//      for (int i = str2.length()-1; i>=0; i--) { // 역순이니까 증감임
//      // str2 인덱스값이 4이기 때문에 // length길이가 5임 
//      // length 5에서 인덱스 4가 되려면 -1을 해야된다/ 왜냐하면 str2는 역순으로 배열4값이 1이기 때문에 역순으로 가져온다.

		
		
		
		
		
		/*
	[4-12]<끝/이건 할수없는거> 구구단의 일부분을 다음과 같이 출력하시오.
			2단~9단*3 출력
		 */
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.println(i+"*"+j);
//			}
//		}
		
		
		/*
	[4-10]<끝> int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
			만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
			(1)에 알맞은 코드를 넣으시오.
		 */
//		int num=12345;
//		int sum1=0;
//		while(num!=0) {
//			sum1 = sum1 + num%10;
//			num = num / 10;
//		}
//		System.out.println("sum1="+sum1);
		
		
		/*
	[4-9]<끝> 숫자로 이루어진 문자열이 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	  	  만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15가 출력이 되어야 한다. (1)에 알맞은 코드를 넣으시오.
		 */
//		String str = "12345";//'1'은 49
//		int sum = 0;
//		
//		for(int i=0; i<str.length(); i++) {
//			sum += str.charAt(i)-'0'; //'0'은 48
//		}
//		System.out.println("sum="+sum);
		
		
		/*
	[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.  
		 */
		
		//꼭 이런식으로 변수를 다 선언하고 확인하고~~~
//		int dice1=0, dice2=0, sum=0;
//		int diceSize=6, result=6; //주사위의 눈의 개수, 구하고자하는 합
//		
//		for(dice1=1; dice1<=diceSize; dice1++) { //주사위1이 1부터 6까지
//			for(dice2=1; dice2<=diceSize; dice2++) { //주사위2가 1부터 6까지
//				sum=dice1+dice2;
//				if(sum==result) {
//					System.out.println("주사위 1 : "+dice1+"  주사위 2 : "+dice2);
//				}
//					
//			}
//		}	
		
		
		
//	[4-5] 다음의 for문을 while문으로 변경하시오.
//		for(int i=0; i<=10; i++){
//			for(int j=0; j<=i; j++) {
//			 System.out.print("*");
//			}
//			System.out.println();
//		}		 
		
//		for(int i=10; i>=0; i--){
//			
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		 	
//		
//		
//		System.out.println("=====================");
//
//		int i=0;
//		int result=10;
//		
//		while(i<=result) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//		
		
		
		
		/*
	[4-4]<끝> 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.  
		 */
//		int i=0, sum=0, s=-1;
		//for문-------------------------
//		for(i=1;true;i++) {
//			sum = sum+i*(s*(-1));
//			if(sum>100)
//				break;
//		}
//		System.out.println(i);
		//for문끝-------------------------
//		
//		while (sum<100) {
//			i++;
//			if(i%2==1) { // i가 홀수라면 +
//				sum = sum + i;
//			}
//			else { // i가 짝수라면 -
//				sum = sum - i;
//			}
//		}
//		System.out.println("1~" + i + "까지 총합 : " + sum);
//		System.out.println("1~" + i + "까지 더 했을 때 100이 넘습니다. ");
//		
//		
		/*
	[4-3]<끝> 1+(1+2)+(1+2+3)+(1+2+3+4)+....+(1+2+3+....+10)의 결과를 계산하시오.  
		 */
//		int sum=0, totalSum=0;
//		for(int i=1; i<=10; i++) {
//			
//			sum = sum + i;
//			totalSum = totalSum + sum; //totalSum이 처음엔 0이니까~?? 이해안가~~
//			
//		}
//		System.out.println("total="+totalSum);
		
	/*
	[4-2]<끝> 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.  
	 */
//		int sum=0;
//		for(int i=1; i<=20; i++) {
//			if(i%2 !=0 && i%3 !=0) {
//				sum+=i;
//			}
//		}
		
		
	/*
	[4-1]<끝> 다음의 문장들을 조건식으로 표현하라
		//      1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 10<x<20
//      10<x && x<20   => x>10 && x<20

//      2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//      !(ch == ' ' || ch =='\t') `
      
//      3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//      ch == 'x' || ch == 'X'
      
//      4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//      '0' <= ch && ch <='9'
      
//      5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//      ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
      
//      6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
//      나눠떨어지지 않을 때 true인 조건식
//      year%400==0 || year%4==0 && year%100!=0
      
//      7. boolean형 변수 powerOn가 false일 때 true인 조건식
//      !powerOn 또는 powerOn==false
      
//      8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
//      str.equals("yes") 또는 "yes".equals(str)
	*/	
	
		
		
	}//end of main();

}// end class

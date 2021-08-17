package kr.co.job.exec;

public class StringTest {

	public static void main(String[] args) {
		// '1' - '0' => 1 아스키코드를 이용하여 문자열을 숫자 정수로 표현
		String str = "12345";
		System.out.println("str문자열의 길이 : "+str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));// str.length()-1; 배열선언 했을때 length는 변수 / 변수인지 메소드인지 구분 필요함.
//		System.out.println(str.charAt(5)); 범위오류
		System.out.println("-------------------------");

//		String(String s) 주어진 문자열(s)을 갖는 String 인스턴스를 생성한다.
		String s="Hellow";
		String s2=s.concat(" World");
		System.out.println(s2+"는 두 문단을 합친 것");
		System.out.println("-------------------------");
		
//		String(char[] value) 주어진 문자열(value)을 갖는 String 인스턴스를 생성한다.
		char[] c= {'H', 'e', 'l', 'l', 'o'};
		String a = new String(c);
		System.out.println(a+"는 문자 'H', 'e', 'l', 'l', 'o'");
		System.out.println("-------------------------");

//		String(StringBuffer buf) StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
		StringBuffer sb = new StringBuffer("Hello");
		String b = new String(sb);
		System.out.println(b+" 이렇게 스트링버퍼를 스트링으로 전환가능");
		System.out.println("-------------------------");
		
//		int compareTo(String str) 문자열(str)과 사전순서로 비교한다. 같으면, 0을, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println("답 : "+i+" /1번aaa+aaa");
		System.out.println("답 : "+i2+" /2번aaa+bbb");
		System.out.println("답 : "+i3+" /3번bbb+aaa");
		System.out.println("-------------------------");

		int i4 = "aaa".compareTo("bbb");
		int i5 = "aaa".compareTo("ddd");
		int i6 = "bbb".compareTo("aaa");
		System.out.println("답 : "+i4+" /1번aaa+bbb");
		System.out.println("답 : "+i5+" /2번aaa+ddd");
		System.out.println("답 : "+i6+" /3번bbb+aaa");
		System.out.println("-------------------------");
		
//		String concat(String str) 문자열(str)을 뒤에 덧붙인다.
		String d = "Hello";
		String d2 = d.concat(" World");
		System.out.println(d2+" 뒤에 덧붙이기");
		System.out.println("-------------------------");
		
//		boolean contains(CharSequence s) 지정된 문자열(s)이 포함되었는지 검사한다.
		String e = "abcdefg";
		boolean b2 = e.contains("bc");
		System.out.println(b2+" /문자열 포함 하는지");
		System.out.println("-------------------------");

//		boolean endsWith(String suffix)지정된 문자열(suffix)로 끝나는지 검사한다.
		String file = "Hello.txt";
		boolean fi = file.endsWith("txt");
		System.out.println(fi+" 지정된 문자열로 끝나는지");
		System.out.println("-------------------------");
		
//		boolean equals(Object dbj) 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String f = "Hello";
		boolean b3 = f.equals("Hello");
		boolean b4 = f.equals("hello");
		System.out.println(b3+" /문자열이 같다면");
		System.out.println(b4+" /문자열이 다르다면");
		System.out.println("-------------------------");
		
//		boolean equalsIgnoreCase(String str) 문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교한다.
		String g ="Hello";
		boolean b5 = g.equalsIgnoreCase("HELLO");
		boolean b6 = g.equalsIgnoreCase("hello");
		System.out.println(b5+" /대문자비교");
		System.out.println(b6+" /소문자비교");
		System.out.println("-------------------------");
		
//		int indexOf(int ch)주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다. (index는 0부터 시작)
		String h = "Hello";
		int idx1 = h.indexOf('o');
		int idx2 = h.indexOf('k');
		System.out.println(idx1+" /Hello의 o");
		System.out.println(idx2+" /Hello의 k");
		System.out.println("-------------------------");
		
//		int indexOf(int ch, int pos)주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다. (index는 0부터 시작)
		String h2 = "Hello";
		int idx3 = h2.indexOf('e', 0);
		int idx4 = h2.indexOf('e', 2);
		System.out.println(idx3+" /'e',0");
		System.out.println(idx4+" /'e',2");
		System.out.println("-------------------------");
		
//		int indexOf(String str) 주어진 문자열이 존재하는지 확인하여 그 위치(index는 0부터 시작)
		String h3 = "ABCDEFG";
		int idx = h3.indexOf("CD");
		System.out.println(idx+" : ABCDEFG에서 CD의 주어진 위치");
		System.out.println("-------------------------");
		
//		String intrn() 문자열을 상수풀(constant poo)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
		String j = new String("abc");
		String j2 = new String("abc");
		boolean b7 = (j==j2);
		boolean b8 = j.equals(j2);
		boolean b9 = (j.intern()==j2.intern());
		System.out.println("문제 String j=abc, j2=abc일 때");
		System.out.println("(j==j2)는 : "+b7); // false : 이콜이 아니라 이콜s써야됨.
		System.out.println("j.equals(j2)는 : "+b8); // true
		System.out.println("(j.intern()==j2.intern()는 : "+b9); // true
		System.out.println("-------------------------");
		
		
		
		
		
	}//end of main();

}// end class

package kr.co.job.array;

public class ArryTest06 {

	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E','8' };  //16진수

		//'C' = 67 - 65 
								//맵핑 //2진수
		String[] binary = { "0000", "0001", "0010", "0011", // 0, 1, 2, 3
							"0100", "0101", "0110", "0111", // 4, 5, 6, 7
							"1000", "1001", "1010", "1011", // 8, 9, A, B
							"1100", "1101", "1110", "1111" }; // C, D, E, F
		
//		선생님 설명
		// 0 1 2 3 4 5 6 7 8 9 A B C D E F G H I J K L M N O P Q R S = hex
		//암호화 하기위해서 사용!
		String result="";
		int index =0;
		for(int i=0; i < hex.length; i++) {
			if(hex[i] >='0' && hex[i] <='9') { // '0'은 48 // '9'는 57
				index = hex[i] - '0'; 
			}
			else {
				//index 값 구하기위해   2
				index = hex[i] - 'A' + 10; // 'A'는 65
			}
			result = result + binary[index];
		}
		
		System.out.println("hex:"+new String(hex));
		System.out.println("binary:"+result);

				
//		책 설명
//		for(int i=0; i < hex.length; i++) {
//			if(hex[i] >='0' && hex[i] <='9') {
//					result = result + binary[hex[i]-'0']; //'8'-'0'의 결과는 8이다.
//			}
//			else {	//A~F이면
//				result = result + binary[hex[i]-'A'+10]; //'C'-'A'의 결과는 2
//			}
//		}
									  // 
//			System.out.println("hex:"+new String(hex));
//			System.out.println("binary"+result);
//			System.out.println("hex:"+new String(hex));
//			System.out.println("binary"+result);
		
		
		
		

	}

}

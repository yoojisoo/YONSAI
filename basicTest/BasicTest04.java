package kr.co.job;

public class BasicTest04 {

	public static void main(String[] args) {
         boolean done = true; // 논리형 true로 초기화함
         int num = 11;
         int result = 0;
         
         // num을 3으로 나눈 나머지를 구하세요
         result = num % 3;
         System.out.println(result);
         
         // num을 5으로 나눈 나머지를 구하세요
         result = num % 5;
         System.out.println(result);
         
         System.out.println("num++ =>" + num++); // num = num + 1;
         System.out.println("num :" + num);
         // ++num 전치 num++ 후치 나중에 값이 더해짐 num먼저 처리되어 보여지고, 값은 더해짐
         
         System.out.println("++num " + ++num);
         System.out.println("num :" + num);
                  
         System.out.println(done);
         done = false;
         System.out.println(done);
         
         if(!done){ // ! 아니라면 , == 같다, != 같지않다
        	 System.out.println("여기임 1번 구역");
         }
         else {
			System.out.println("저기임 2번 구역");
		 }        
      
         System.out.println("=================");
         done = true;
         
         if(done) {
        	 System.out.println("여기임 1번 구역");
         }
         else {
			System.out.println("저기임 2번 구역");
		 }   
         
         
         
         
	}

}

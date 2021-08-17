package kr.co.job.chap6;

public class Test0000001 {

	public static void main(String[] args) {
		// 다른 작업이 진행중에 합을 구해야되는데??
		
		AddTest a1 = new AddTest();
		int r1 = a1.Sum(5, 5, 5); //정수형 타입의 sum()메소드가 호출됨
		System.out.println(r1);
		
		System.out.println(a1.Sum(12, 18)); //이렇게 바로 출력 가능
	}
	
}		


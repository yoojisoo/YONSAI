/*
 * 생성자 : 모든 클래스는 하나의 생성자가 필요함. 
 *  클래스에서 정의하지않으면 기본생성자(디폴트생성자)가 자동발생.
 *  인스턴스시 필드의 값(속성)을 초기화하는 작업이 필요할 때 생성자 작성
 */
package kr.co.job.chap6;

public class AccountTest01 {

	public static void main(String[] args) {
		// Account 클래스를 객체로 생성.
		Account obj = new Account();
		obj.accNo = "123-23-2324";
		obj.name = "홍길동";
		obj.balance = 10000;

		// 은행계좌 생성시 이름을 주고싶다
		Account obj2 = new Account("장길산");
		// obj2.name = "장길산";
		Account obj3 = new Account("홍", "232-312-321-2", 100);

		//
		// 만원을 입금
		obj.deposit(10000);
		// 오천원 출금
		try {
			obj.withdraw(500000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("여기는 무조건 거쳐간다.");
		}

//			System.out.println("예금주명 : " + obj.name);
//			System.out.println("계좌번호 : " + obj.accNo);
//			System.out.println("잔액 : " + obj.balance);
		printAccount(obj);
//			
//			System.out.println("예금주명 : " + obj2.name);
//			System.out.println("계좌번호 : " + obj2.accNo);
//			System.out.println("잔액 : " + obj2.balance);
		printAccount(obj2);
//			System.out.println("예금주명 : " + obj3.name);
//			System.out.println("계좌번호 : " + obj3.accNo);
//			System.out.println("잔액 : " + obj3.balance);
		printAccount(obj3);

	}

	private static void printAccount(Account obj) {
		// TODO Auto-generated method stub
		System.out.println("예금주명 : " + obj.name);
		System.out.println("계좌번호 : " + obj.accNo);
		System.out.println("잔액 : " + obj.balance);
	}

}

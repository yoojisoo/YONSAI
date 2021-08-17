/*
 * 은행계좌 클래스 
 * - 속성(field) : 계좌번호, 예금주, 잔액
 * - 기능(Method) : 입금한다, 출금한다. 잔액한다()
 * 
 * 
 * 생성자 : 모든 클래스는 하나의 생성자가 필요함. 
 *  클래스에서 정의하지않으면 기본생성자(디폴트생성자)가 자동발생.
 *  인스턴스시 필드의 값(속성)을 초기화하는 작업이 필요할 때 생성자 작성
 *  ====> 매개변수 생성자.
  */
package kr.co.job.chap6;

public abstract class Account {
//public abstract class Account {   => 객체생성불가
	//필드
	
	public String accNo;
	public String name;
	public int balance;
	//생성자
	Account(){}  // 디폴트생성자
	
	//생성시 이름
	Account(String name){
		this.name = name;
	}
	// 생성시 이름과 계좌번호
	Account(String name, String accNo){
		this.name = name;
		this.accNo = accNo;
	}
	
	Account(String name, String accNo,int balance){
//		this.name = name;
//		this.accNo = accNo;
		this(name,accNo);// 첫줄에 this()사용해야함
		this.balance = balance;
	}
	
	//메소드
	void deposit(int amount) {  //예금한다.
		balance += amount;
	}

	public int withdraw(int amount) throws Exception { //출금한다.
		if(balance<amount)
			throw new Exception("잔액이 부족합니다.");  // 예외를 발생시키기 "잔액이 부족합니다."
		balance -= amount;		
		return amount;
	}
	// 상속받을때 마다 메소드 고쳐써야합니다. => 강제성부여
	abstract  public void view();
	//	public int withdraw(int amount) { //출금한다.
//		if(balance<amount)
//			return 0;  // 잔액이 부족하면 0을 리턴
//		balance -= amount;		
//		return amount;
//	}
	
//	abstract void test(int n);
	

}








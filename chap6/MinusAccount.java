/*
 * 마이너스한도 , 인출한다를 수정해야함.
 */
package kr.co.job.chap6;

public class MinusAccount extends Account{
	int creditLine; //마이너스한도액

	public MinusAccount() {}
	
	public MinusAccount(String name,String accNo,int balance,int creditLine){
		super(name,accNo,balance);
		this.creditLine= creditLine;
	}
	
	// 인출한다를 수정함   => 메소드 오버라이딩
	@Override
	public int withdraw(int amount) {
		if((balance+creditLine) < amount)
			return 0;
		balance -= amount;
		return amount;
	}

	@Override   // Account 클래스의 view()메소드가 추상이어서 반드시 메소드가 있어야한다.
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("한도액만큼 확인됩니다.");
	}
	
}










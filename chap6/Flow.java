/*
 * 생물이 가져야하는 기본 기능을 작성한 인터페이스
 * 숨쉰다(), 잔다()
 * 
 */
package kr.co.job.chap6;

public interface Flow {
	//고정필드와 추상메소드
	abstract public void 숨쉰다();
	public void 잔다(); //abctract 생략 : 인터페이스라 생략가능
}

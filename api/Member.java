/*
 * 모델링(기획->설계)
 * 회원 : 순번, 아이디, 이름, 나이, 취미, 종교...
 * 속성 - 필수데이터, 선택데이터 (최기화는 new할때)
 * 회원의 기능은 뭐지???? 가입하기, 수정하기, 삭제하기, 회원조회(전체,선택) => 이런건 제어하기위한 메인(Control)
 * 생성자 -> 객체를 인스턴스(new)할때 필드값을 초기화를 한다.
 */
package kr.co.job.api;

public class Member {
	private String no;
	private String id;
	private String name;
	private int age;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}

	//생성자 (없을땐 디폴트) [우클릭-Source-Generate Constructor using to invoke]
	//M1의 필드값을 입력받은 데이터로 초기화해서 생성함.
	public Member() {} //<= 디폴트 생성자
//	public Member(String no, String id, String name, int age) { <=
//		super();
//		this.no = no;
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
	
		
		
	//getter, setter 작성
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() { //m1보여주는것
		return "회원정보 [번호 : " + no + ", ID : " + id + ", 이름 : " + name + ", 나이 : " + age + "]";
	}
	
	
	
	
	
}

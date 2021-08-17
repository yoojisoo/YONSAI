/*
 * 학생 클래스  => Student
 * [속성, 멤퍼변수, 필드]
 * 학생명, 학과, 학번, 나이
 * [생성자]
 * [기능]-안만들고 해본다~
 * 
 *  Bean Class, VO, DTO (vo와vto는 같은 뜻)
 *  [메소드]
 * 
 */
package kr.co.job.chap6;

public class Student {
	//클래스 변수
	static int cnt; //스택틱은 실행시 제일 맨 위에~ //스택틱 필드
	// 사용시 Student.cnt  or  obj.cnt
	
	
	//필드
	private String name;
	private String major;
	private String sNo;
	private int age;
	
	
	
	// getter setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getsNo() {
		return sNo;
	}


	public void setsNo(String sNo) {
		this.sNo = sNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//생성자
	public Student() {
		cnt++; //학생수 증가
		System.out.println("학생 생성수");
	}
	
	
	public Student(String name, String major, String sNo, int age) {
		super(); //대빵클래스 obj를 뜻함//찾았는데 없으면 대빵한테 감//지워두 됨
		this.name = name;
		this.major = major;
		this.sNo = sNo;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", sNo=" + sNo + ", age=" + age + "]";
	}
	
	
	
	
}

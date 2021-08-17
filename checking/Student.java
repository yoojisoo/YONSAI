/*  객체지향 - 모델링 (틀) : 재사용성, 용이성, 상속성-확장, 다형성, 캡슐화, 정보은닉
 * 
 *  [클래스의 다형성]
 *  - List  => ArrayList, LinkedList
 *  ArrayList list = new ArrayList();
 *  List list2 = new ArrayList();
 *  
 *  학생 클래스    => Student
 *  [속성, 멤버변수, 필드]
 *  학생명, 학과, 학번, 나이
 *  [생성자]
 *  
 *  Bean Class, VO, DTO
 *  [메소드]
 */
/* [학생 클래스]
 * 이름(name),나이(age),학번(snum),전공(major)
 *    => private
 * 생성자 -> 4개필드
 * toString()
 */
package kr.co.job.checking;


public class Student {
	private String name; //이름
	private String age; //나이
	private String snum; //학번
	private String major; //전공
	
	public Student() {} //디폴트 생성자
	
	public Student(String name, String age, String snum, String major) { //생성자
		super();
		this.name = name;
		this.age = age;
		this.snum = snum;
		this.major = major;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "학생 [이름:" + name + ", 나이:" + age + ", 학번:" + snum + ", 전공:" + major + "]";
	}
	
	
	
	
	
}

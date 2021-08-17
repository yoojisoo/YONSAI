package kr.co.job.jdbc;

public class Test02VO {

	private int tno;
	private String pname;
	private int age;
	private String etc;

	
	public Test02VO(){};
	
	public Test02VO(int tno, String pname, int age, String etc) {
		super();
		this.tno = tno;
		this.pname = pname;
		this.age = age;
		this.etc = etc;
		
	}

	@Override
	public String toString() {
		return "tno=" + tno + ", pname=" + pname + ", age=" + age + ", etc=" + etc + "";
	}

	
	
	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	
	
}

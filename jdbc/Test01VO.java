package kr.co.job.jdbc;

public class Test01VO {
	private int tno;
	private String pname;
	private int age;
	private String etc;
	
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
	@Override
	public String toString() {
		return "Test01VO [tno=" + tno + ", pname=" + pname + ", age=" + age + ", etc=" + etc + "]";
	}
	
	

}

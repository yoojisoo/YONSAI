package api;

public class Student {
	private int no;
	private String name="홍길동";
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public Student() {
		super();
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
	
	

}

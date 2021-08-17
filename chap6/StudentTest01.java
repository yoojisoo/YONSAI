package kr.co.job.chap6;

public class StudentTest01 {

	public static void main(String[] args) {
		Student stu; //선언
		stu = new Student("홍길동", "컴공", "202105772", 20); //인스턴스화

		System.out.println(stu); //해당 객체 출력
		// 컴공 -> 미대
//		stu.major = "미대"; //private해서 빨간줄 떳옹... 그래서 get.set 만들오야해
		stu.setMajor("미대");
		System.out.println("당신의 학과 : "+stu.getMajor());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("예외출력");
			e.printStackTrace();
			
		}
		System.out.println("1초후 출력됨");
	}
		
		
		
		
	}



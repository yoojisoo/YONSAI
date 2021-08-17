package kr.co.job.etc;

import java.util.Calendar;

public class 달력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar time = Calendar.getInstance();
//		Calendar time = new Calendar(); //추상 클래스여서 new가 안되는것.
		System.out.println(time.getTime());
		System.out.println(time.getWeekYear());
		System.out.println(time.getTimeInMillis());
		

		System.out.println(time.getTime());
		time.add(Calendar.SECOND, 120);
		System.out.println("2 : "+time.getTime());
		time.add(time.SECOND, 120);
		System.out.println("3 : "+time.getTime());
		
		
		
		
	}
	
}

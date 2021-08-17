package kr.co.job.oper;

public class whileTest02 {

	public static void main(String[] args) {

		int i=1, sum=0;
		while(true) {
			sum += i;
			i++;	
			if(i==10) {
				break;
			}
		}
		System.out.println("sum = " + sum);

	}

}

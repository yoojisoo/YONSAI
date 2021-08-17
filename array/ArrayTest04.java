/*
 * 10개 배열을 생성하여 배열의값을 0~9까지 순차적으로 초기화하고
 * 해당 배열의값을 섞어보기
 * 
 * 1)임의의 인덱스값 추출-> n
 * 2) / numArr[n] <---> numArr[0] 교환
 * 0번째 인텍스 배열을 tmp에 옮기고
 * 0번째 인텍스 배열에 추출된 n배열값을 대입
 * n배열값에 tmp대입
 * 
 * 3)1,2를 100번정도 반복함
 */

package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 
	
		
		
		
		
		
		System.out.println("------------------------------------------");
		int[] numArr = new int[100];
		int cnt=0, line=10;
		int n=0, tmp;
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; //배열을 0~99 숫자로 초기화 //배열의 i에 i값 넣어준것. i에*10하면 10단위로 나온다.
			System.out.print(numArr[i]+",");
			cnt++;
			if(cnt==line) {
				System.out.println();
				cnt =0;
			}
//			if(i%10==9) {
//				System.out.println();
//			}
		}


		for(int i=0; i<1000; i++) { //1000번 돌릴꺼다~
			n = (int)(Math.random()*100); //0~999까지 임의의 값 추출 
			tmp = numArr[0]; //0번째 인텍스 배열을 tmp에 옮기고
			numArr[0] = numArr[n]; //0번째 인텍스 배열에 추출된 n배열값을 대입
			numArr[n] = tmp; //n배열값에 tmp대입
		}
		
//		System.out.println(Arrays.toString(numArr));
		
		
		
		System.out.println("------------------------------------------");
		//while문
		boolean done = true;
		int[] num2=new int[10];
		int temp=0, rand=0;
		
		for(int i =0; i<num2.length; i++) {
			num2[i] = i; //배열에 i(0~9까지) i+1하면 1부터~10까지
			// 0 1 2 3 4 5 6 7 8 9 
		}
		int count =0;
		
		while(done) {
			
			int same =0;
			
			
			rand = (int)(Math.random()*10)+0;
			temp = num2[0]; //temp에 0칸 값 넣고
			num2[0] = num2[rand]; //0칸에 랜드값넣고
			num2[rand] = temp; //temp값을 랜드값에 넣고
			
			
			for(int i=0; i<num2.length; i++) { //i가 10보다 작을때까지 반복
				if(i!=num2[i]) 
				//만약 !=  : 같지 않다면, 위에서 이미 랜던값이니까. 당연히 같지않아서 진행! 
				{ //중복되지 않고, 카운트를 세기 위해 존재하는 for문
					same++; //같으면 횟수체크
				}
			}
			if(same ==10) { // 종료문!
				System.out.println("횟수: "+count);
				done = false;
			}
			count++;
		}
		
//		System.out.println("while문배열="+Arrays.toString(num2));
		

		
		
	} //main

} //class

	


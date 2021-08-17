package kr.co.job.array;

import java.util.Scanner;

public class ArrayTest08 {

	public static void main(String[] args) {
		// 220p 좌표에 X표하기
		final int SIZE=10; //final변수 고정값. 변경불가
		int x=0, y=0;
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
//				1   2  3  4  5  6  7  8  9
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 1
				{1, 1, 1, 1, 0, 0, 1, 0, 0}, // 2
				{0, 0, 0, 0, 0, 0, 1, 0, 1}, // 3
				{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 4
				{0, 0, 0, 1, 0, 0, 0, 0, 0}, // 5
				{1, 0, 0, 0, 0, 0, 0, 1, 0}, // 6
				{0, 0, 0, 0, 0, 0, 0, 0, 0}, // 7
				{0, 1, 1, 1, 1, 0, 0, 0, 0}, // 8
				{0, 0, 0, 0, 0, 0, 1, 1, 0}  // 9
		};
		// 1행에 행번호를, 1열에 열번호를 저장한다.
		for(int i=1; i<SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i+'0');
		}
		Scanner scan = new Scanner (System.in);
		
		while(true) {
			System.out.print("좌표를 입력하세요. (종료는 00)>");
			String input = scan.nextLine(); //입려받은 내용을 input에 저장
			
			if(input.length()==2) { //두 글자를 입력한 경우
				x = input.charAt(0) - '0'; //문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0) //x와 t가 모두 0인 경우 종료
					break;
			}
			
			if(input.length() != 2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) { //경계값 설정
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			// shipBoard[x-1][y-1]의 값이 1이면, '0'을 board[x][y]에 저장한다.
			// board[x][y] = shipBoard[x-1][y-1]==1 ? 'o' : 'x';
			if(shipBoard[x-1][y-1]==1) {
				board[x][y] = 'O';
			}
			else {
				board[x][y] = 'X';
				
			}
			
			//배열 board의 내용을 화면에 출력한다.
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.print(board[i][j] + " "); //열에 띄어쓰기 하고싶어서 다시 2차원 배열로 ㅋㅋ
//					System.out.print(board[i][); //board[i]는 1차원 배열 han line
				}
				System.out.println();					
			}
			
		}//while
		
		
		
		

	} //

} //

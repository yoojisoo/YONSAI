/*
 * 채연씨 코드
 * 
 */
package kr.co.job.checking;

import java.util.Scanner;

public class RoomCh {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
//       인덱스           00 / 01 / 02        10 / 11 / 12      20 / 21 / 22       30 / 31 / 32
   int[][] room = { { 201, 202, 203 }, { 301, 302, 303 }, { 401, 402, 403 }, { 501, 502, 503 } };
   int[][] roomBook = { { 0, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 }, { 0, 1, 1 } };    

   int roomFloor, roomNum;

   boolean done = true;
   while (done) {
      System.out.println("-------------[메뉴]-------------");
      System.out.println("1.방예약 2.예약취소 3.호실확인 99 종료");
      int ch = scan.nextInt();

      switch (ch) {
      case 1: // 방예약
         System.out.println("[방예약]");
         System.out.print("층 -> ");
         roomFloor = scan.nextInt();
         System.out.print("호 -> ");
         roomNum = scan.nextInt();

         if (roomBook[roomFloor - 2][roomNum - 1] == 0) {
            System.out.println(room[roomFloor - 2][roomNum - 1] + "호 예약완료");
            roomBook[roomFloor - 2][roomNum - 1] = 1;
         } else {
            System.out.println("예약마감");
         }

         break;

      case 2: // 예약취소
         System.out.println("[방취소]");
         System.out.print("층 -> ");
         roomFloor = scan.nextInt();
         System.out.print("호 -> ");
         roomNum = scan.nextInt();

         if (roomBook[roomFloor - 2][roomNum - 1] == 1) {
            System.out.println(room[roomFloor - 2][roomNum - 1] + "호 취소완료");
            roomBook[roomFloor - 2][roomNum - 1] = 0;
         } else {
            System.out.println("예약마감");
         }

         break;

      case 3: // 호실확인
         System.out.println("예약가능");
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
               if (roomBook[i][j] == 0)
                  System.out.print(room[i][j] + " ");
            }
            System.out.println();
         }

         break;

      case 99: // 종료
         System.out.println("[종료]");
         done = false;
         break;

      default: // 그외의값
         System.out.println("다시입력");
         break;

      }

   }

	}

}

/*
 * 상품추가, 수정, 삭제, 조회
 * public
 */
package kr.co.job.api;

import java.util.Scanner;

public class GoodControl2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Goods gds1 = new Goods(); // 선언
		GoodsMessageimpl gmi = new GoodsMessageimpl(); // 좀더 객체지향에 가까운 구성~~~
		boolean check = true;

		
		while (check) {

			int menuSelectNumber = 0;
			menuSelectNumber = gmi.menuSelect();
			switch (menuSelectNumber) {

			case 1: // 상품추가
				gmi.goodsJoin(gds1);
				break;

			case 2: // 상품삭제
				gmi.goodsDelete(gds1);
				break;

			case 3: // 상품조회
				gmi.goodsView(gds1);
				break;
				
			case 4: // 상품수정
				gmi.goodsModify(gds1);
				break;

			case 99: // 종료
				check = gmi.closeSystem(gds1);
				break;

			default:
				System.out.println("잘못 입력하였습니다.");


			}// switch

		} // while

	}

}

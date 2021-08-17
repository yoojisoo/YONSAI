package kr.co.job.api;

import java.util.Scanner;

public class GoodsMessageimpl implements GoodsMessage{
	Scanner scan = new Scanner (System.in);
	boolean check = true;
	
	@Override
	public int menuSelect() { //메뉴
		System.out.println("================[ 메 뉴 ]================");
		System.out.println("1.상품추가 2.상품삭제 3.상품조회 4.상품수정 99.종료");
		System.out.print("selectNumber : ");
		int menuSelectNumber = scan.nextInt();

		return menuSelectNumber;
	}

	@Override
	public void goodsJoin(Goods gds1) { //상품추가
		System.out.println("상품을 추가합니다.");
		setAllValue(gds1);
		System.out.println("[" + gds1.getgName() + "] 상품이 추가되었습니다.");
	}

	private void setAllValue(Goods gds1) { //all 상품추가
		System.out.print("상품번호 : ");
		String gNo = scan.next();
		gds1.setgNo(gNo);
		System.out.print("상품명 : ");
		String gName = scan.next();
		gds1.setgName(gName);
		System.out.print("상품가격 : ");
		int gPrice = scan.nextInt();
		gds1.setgPrice(gPrice);
		scan.nextLine();
		System.out.print("제조나라 : ");
		String gMade = scan.next();
		gds1.setgMade(gMade);
	}

	@Override
	public void goodsDelete(Goods gds1) { //상품삭제
		if(gds1.getgPrice()==0) {
			System.out.println("등록된 상품이 없습니다.");
		}
		else {
			System.out.println("[" + gds1.getgName() + "] 상품정보를 삭제하시겠습니까?");
			System.out.println("1.삭제 2.취소");
			int del = scan.nextInt();
			if (del == 1) {
				gds1.delete(del);
				System.out.println("상품정보가 삭제되었습니다.");				
			}
			else if (del == 2) {
				System.out.println("상품삭제 시스템을 취소합니다.");	
				return;
			}
			else {
				System.out.println("잘못 입력하였습니다.");
			}			
		}
	}

	@Override
	public void goodsView(Goods gds1) { //상품조회
		if(gds1.getgPrice()==0) {
			System.out.println("등록된 상품이 없습니다.");
		}
		else {
			System.out.println(gds1);			
		}
	}
	
	@Override
	public void goodsModify(Goods gds1) { //상품수정
			if(gds1.getgPrice()==0) {
				System.out.println("등록된 상품이 없습니다.");
			}
			else {
				System.out.println("===============[ 수정하기 ]===============");
				System.out.println("1.상품번호 2.상품명 3.상품가격 4.제조나라 5.전체수정");
				System.out.print("select number : ");
				int selectMoNumber = scan.nextInt();
				if (selectMoNumber == 1) {
					System.out.print("상품번호 : ");
					String gNo = scan.next();
					gds1.setgNo(gNo);
				} else if (selectMoNumber == 2) {
					System.out.print("상품명 : ");
					String gName = scan.next();
					gds1.setgName(gName);
				} else if (selectMoNumber == 3) {
					System.out.print("상품가격 : ");
					int gPrice = scan.nextInt();
					gds1.setgPrice(gPrice);
				} else if (selectMoNumber == 4) {
					System.out.print("제조나라 : ");
					String gMade = scan.next();
					gds1.setgMade(gMade);
				} else if (selectMoNumber == 5) {
					setAllValue(gds1);
				} else {
					System.out.println("잘못 입력하였습니다.");
				}
				System.out.println("[" + gds1.getgName() + "] 상품의 정보가 수정되었습니다.");				
			} //else
		
	} //goodsModify

	@Override
	public boolean closeSystem(Goods gds1) {
		System.out.println("시스템을 종료합니다.");
		return check=false;
	}//closeSystem

} //class


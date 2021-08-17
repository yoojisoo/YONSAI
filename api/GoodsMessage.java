/*
 * 인터페이스는
 * final필드, 추상메소드로 구성됨
 * 여기는~~ 계획하는곳~~~ 이런~~ 메소드? 쓸거다 ~~~~~~~~~~~ 이렇게 구성할거다~~~~~~~~~~
 */
package kr.co.job.api;

public interface GoodsMessage {
	//메뉴선택
	public int menuSelect();
	//상품추가
	public void goodsJoin(Goods gds1);
	//상품삭제
	public void goodsDelete(Goods gds1);
	//상품조회
	public void goodsView(Goods gds1);
	//상품수정
	public void goodsModify(Goods gds1);
	//시스템종료
	public boolean closeSystem(Goods gds1);

	
	
}

package kr.co.job.api;

public class Goods {

	private String gNo; //상품번호
	private String gName; //상품명
	private int gPrice; //상품가격
	private String gMade; //상품제조나라
	
	
	//생성자-디폴트 그냥 넣어야됨!
	public Goods() {}
	//생성자
	public Goods(String gNo, String gName, int gPrice, String gMade) {
		super();
		this.gNo = gNo;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gMade = gMade;

	}
	
	//삭제기능
	public void delete(int del) {
		this.gNo = null;
		this.gName = null;
		this.gPrice = 0;
		this.gMade = null;
	}
	
	public String getgNo() {
		return gNo;
	}
	public void setgNo(String gNo) {
		this.gNo = gNo;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getgPrice() {
		return gPrice;
	}
	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}
	public String getgMade() {
		return gMade;
	}
	public void setgMade(String gMade) {
		this.gMade = gMade;
	}
	

	
	@Override
	public String toString() {
		return "상품조회 [상품번호:" + gNo + ", 상품명:" + gName + ", 가격:" + gPrice + ", 제조나라:" + gMade + "]";
	}
	
	
	

}

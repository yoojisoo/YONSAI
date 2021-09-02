package co.kr.job;

public class goodsVO {
	
	
	private String name;
	private String price;
	private String makeDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMakeDate() {
		return makeDate;
	}
	public void setMakeDate(String makeDate) {
		this.makeDate = makeDate;
	}
	@Override
	public String toString() {
		return "goodsVO [name=" + name + ", price=" + price + ", makeDate=" + makeDate + "]";
	}
	
	

}

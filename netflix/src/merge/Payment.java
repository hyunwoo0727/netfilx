package merge;

public class Payment {
	private String name,cardCompany,cardNum,payDate,expireDate;
	int price;
	
	public Payment(String name, String cardCompany, String cardNum, String payDate, String expireDate, int price) {
		super();
		this.name = name;
		this.cardCompany = cardCompany;
		this.cardNum = cardNum;
		this.payDate = payDate;
		this.expireDate = expireDate;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardCompany() {
		return cardCompany;
	}
	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getDeadline() {
		return expireDate;
	}
	public void setDeadline(String expireDate) {
		this.expireDate = expireDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}

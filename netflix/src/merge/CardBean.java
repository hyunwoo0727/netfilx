package merge;

public class CardBean {
	private String cardNum,validYear,validMonth,name,cardCompany;
	private int birthYear,birthMonth,birthDay;
	
	public CardBean(String cardNum, String validYear, String validMonth, String name,String cardCompany, int birthYear, int birthMonth,
			int birthDay) {
		this.cardNum = cardNum;
		this.validYear = validYear;
		this.validMonth = validMonth;
		this.name = name;
		this.cardCompany = cardCompany;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
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
	public String getValidYear() {
		return validYear;
	}
	public void setValidYear(String validYear) {
		this.validYear = validYear;
	}
	public String getValidMonth() {
		return validMonth;
	}
	public void setValidMonth(String validMonth) {
		this.validMonth = validMonth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
}

package merge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemberBean {
	private String name,email,password,membershipGrade,ageGrade,phone,cardNum,expireDate
				  ,regDate,birth;
	private boolean isReceiveEmail,isAutoPay;
	
	public MemberBean(String name,String email,String password,String membershipGrade,String phone,String cardNum,String birth,boolean isReceiveEmail){
		this.name = name;
		this.email = email;
		this.password = password;
		this.membershipGrade = membershipGrade;
		this.phone = phone;
		this.cardNum = cardNum;
		this.birth = birth;
		this.isReceiveEmail = isReceiveEmail;
		this.isAutoPay = true;
		this.regDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMembershipGrade() {
		return membershipGrade;
	}
	public void setMembershipGrade(String membershipGrade) {
		this.membershipGrade = membershipGrade;
	}
	public String getAgeGrade() {
		return ageGrade;
	}
	public void setAgeGrade(String ageGrade) {
		this.ageGrade = ageGrade;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getDeadLine() {
		return expireDate;
	}
	public void setDeadLine(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getRegDate() {
		return regDate;
	}
	public boolean isReceiveEmail() {
		return isReceiveEmail;
	}
	public void setReceiveEmail(boolean isReceiveEmail) {
		this.isReceiveEmail = isReceiveEmail;
	}
	public boolean isAutoPay() {
		return isAutoPay;
	}
	public void setAutoPay(boolean isAutoPay) {
		this.isAutoPay = isAutoPay;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}

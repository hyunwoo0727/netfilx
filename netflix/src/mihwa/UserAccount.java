package mihwa;

public class UserAccount {
	private String email,password,tel,cardNum,grade,deadline,proflieName,birth;
	int age;
	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getProflieName() {
		return proflieName;
	}
	public void setProflieName(String proflieName) {
		this.proflieName = proflieName;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = 0;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		setAge();
		this.birth = birth;
	}
}

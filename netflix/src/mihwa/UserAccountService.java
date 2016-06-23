package mihwa;

public interface UserAccountService {
	public void changeEmail(String newEmail);
	public void changePassword(String oldPw,String newPw);
	public void changeTel(String tel);
	public void chagneCardNum(String newCardNum);
	public void joinMemberShip(String grade);	
}

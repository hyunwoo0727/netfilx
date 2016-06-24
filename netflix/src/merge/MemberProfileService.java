package merge;

public interface MemberProfileService {
	public void updatePassword(String newPassword);
	public void updatePhone(String newPhone);
	public void updateCardNum(String newCardNum);
	public void changeAccount(String newEmail);
	public void startMembership();
	public void stopMembership();
	public void deleteAccount(String email);
	
}

package hyunwoo;

public interface JoinMembrService {
	public boolean checkExistEmail(String email);
	public boolean validatePassword(String pw);
	public boolean validateEmail(String email);
	public void checkReceiveEmail(boolean isChecked);
	public void registAccount(JoinMemberPage member);
}

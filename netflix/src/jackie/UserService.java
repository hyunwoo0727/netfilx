package jackie;

public interface UserService {
	public void submitInfo(String plan, String email, String pw, String cardNo, String cardType, String expireDate, String birthDate);
	public void showConfirmation();
}

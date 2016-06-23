package mihwa;

public interface LoginService {
	public void Login(LoginPage login);
	public boolean checkPassword(LoginPage login);
	public void saveEmail(String email);
}

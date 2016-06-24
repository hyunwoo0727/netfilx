package merge;

public interface MemberAdminService {
	public void deleteMember(String email);
	public void updateDeadline(String email,String expireDate);
	public void sendEmail(String message);
}

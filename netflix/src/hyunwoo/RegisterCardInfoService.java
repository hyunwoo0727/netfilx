package hyunwoo;

public interface RegisterCardInfoService {
	public boolean checkAllAgree();
	public boolean checkCardInform(String cardNum,String name,String validYear,String validMonth);
	public void startMembership(RegisterCardInfo info);
}

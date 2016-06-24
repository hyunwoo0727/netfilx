package hyunwoo;

public interface RegisterCardInfoService {
	public boolean checkAllAgree();
	public boolean checkCardInform(String cardNum,String name,String validYear,String validMonth,int birthYear,int birthMonth,int birthDay);
	public void startMembership(RegisterCardInfo info);
}

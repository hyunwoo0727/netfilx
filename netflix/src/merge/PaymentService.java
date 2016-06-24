package merge;

public interface PaymentService {
	public void cancelPay(String email,String cardNum);
	public void addPayment(CardBean cardBean);
}

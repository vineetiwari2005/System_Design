package Adapter;

public interface PaymentProviderInterface {
    public String generateLink();
    public void pay(PaymentRequest PaymentRequest);
    public PaymentStatus checkStatus();
    
    
}

package Adapter;

public class RazorPayProvider implements PaymentProviderInterface {
    private RazorPayApi RazorPayApi=new RazorPayApi();
   
    @Override
    public String generateLink(){
        return RazorPayApi.makeLink();
    }
    @Override
    public void pay(PaymentRequest PaymentRequest) {
        RazorPayApi.prePay();
        RazorPayApi.pay(PaymentRequest.name,PaymentRequest.amount);
    }
    @Override
    public PaymentStatus checkStatus() {
        RazarPayStatus status=RazorPayApi.checkStatus();
        return toPaymentStatus(status);
    }
    private PaymentStatus toPaymentStatus(RazarPayStatus status){
        if(status==RazarPayStatus.PASS){
            return PaymentStatus.SUCCESS;
        }
        else{
            return PaymentStatus.FAILURE;
        }
    }

    
}

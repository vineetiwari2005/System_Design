package Adapter;

public class CashFreeProvider implements PaymentProviderInterface {
    private CashFreeApi CashFreeApi=new CashFreeApi();
    public String generateLink(){
        return CashFreeApi.createURL();
    }
    public void pay(PaymentRequest PaymentRequest){
        CashFreeApi.doPayment(PaymentRequest.amount);
    }
    public PaymentStatus checkStatus(){
        CashFreeStatus cashFreeStatus=CashFreeApi.verifyStatus();
        return toPaymentStatus(cashFreeStatus);
    }
    private PaymentStatus toPaymentStatus(CashFreeStatus status){
        if(status==CashFreeStatus.OK){
            return PaymentStatus.SUCCESS;
        }
        else{
            return PaymentStatus.FAILURE;
        }
    }
    
}

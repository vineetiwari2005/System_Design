package Adapter;

public class CashFreeApi {
    public String createURL(){
        return "cashfree";
    }
    public void doPayment(int amount){
        System.out.println("cashfree payment " + amount);
    }
    public CashFreeStatus verifyStatus(){
        return CashFreeStatus.OK;
    }
    
}

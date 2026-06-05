package Adapter;

public class RazorPayApi {
    public String makeLink(){
        return "razorpay";
    }
    public void prePay(){
        System.out.println("razorpay prepayment");
    }
    public void pay(String name,int amount){
        System.out.println("razorpay payment  " + amount);
    }
    public RazarPayStatus checkStatus(){
        return RazarPayStatus.PASS;
    }
}

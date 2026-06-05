package Adapter;

public class Main {
    public static void main(String[] args) {
        PaymentRequest paymentRequest=new PaymentRequest();
        paymentRequest.name="vineet";
        paymentRequest.phone="12345321";
        paymentRequest.email="vineet@gmail.com";
        paymentRequest.amount=1500;
        System.out.println("processing razorpay --------->>>>>>");
        PaymentProviderInterface razpay=new RazorPayProvider();
        System.out.println(razpay.generateLink());
        razpay.pay(paymentRequest);
        System.out.println(razpay.checkStatus());

        System.out.println("processing cashfree---------->>>>>>>>");
        PaymentProviderInterface cashfree=new CashFreeProvider();
        System.out.println(cashfree.generateLink());
        cashfree.pay(paymentRequest);
        System.out.println(cashfree.checkStatus());

    }
    
}

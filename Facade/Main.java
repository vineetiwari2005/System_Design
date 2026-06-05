package Facade;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Initiating Order Request ---");
        OrderManager orderManager=new OrderManagerImpl();
        orderManager.createOrder();
        System.out.println("--- Order Process Complete ---");
    }
}
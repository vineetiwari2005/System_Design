package Facade;

public class OrderManagerImpl implements OrderManager {
    private OrderProcessor orderProcessor=new OrderProcessor();

    @Override
    public void createOrder(){
        orderProcessor.process();
    }

    
}

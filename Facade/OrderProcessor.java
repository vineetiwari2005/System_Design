package Facade;

public class OrderProcessor {
    private RecomendationService recomendationService=new RecomendationService();
    private PaymenService paymenService=new PaymenService();
    private WareHouseProcessor wareHouseProcessor=new WareHouseProcessor();
    public void process(){
        wareHouseProcessor.process();
        recomendationService.recommend();
        paymenService.pay();
    }
    
}

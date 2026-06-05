package Facade;

public class WareHouseProcessor {
    InventoryService inventoryService=new InventoryService();
    AnalyticsService analyticsService=new AnalyticsService();
    public void process(){
        inventoryService.checkInventory();;
        analyticsService.track();
    }
    
}

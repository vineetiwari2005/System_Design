package Observer;

public class BitcoinTracker extends Observable implements BitcoinManager {
    Bitcoin bitcoin=new Bitcoin();

    @Override
    public Bitcoin getBitcoin() {
        return this.bitcoin;
    }

    @Override
    public void SetPrice(Double price) {
        Double oldPrice=bitcoin.getPrice();
        
        bitcoin.SetPrice(price);
        if(Math.abs(price-oldPrice)>=50){
            notifyChange();
        }
    }
    
}

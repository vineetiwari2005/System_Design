package Decorator;

public class GunPowerDecorator extends Decorator {
    GunPowerDecorator(Gamer nextLayer){
        super(nextLayer);
    }

    @Override
    public void getAbility() {
        nextLayer.getAbility();
        System.out.println("now we have gun as well");
    }
    
    
}

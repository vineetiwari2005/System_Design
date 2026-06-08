package Decorator;

public class StarPowerDecorator extends Decorator  {
  public   StarPowerDecorator(Gamer nexLayer){
        super(nexLayer);
    }

    @Override
    public void getAbility() {
        nextLayer.getAbility();
        System.out.println("now we have star power yay!!!");
    }

    
}

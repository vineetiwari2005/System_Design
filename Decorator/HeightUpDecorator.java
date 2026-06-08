package Decorator;

public class HeightUpDecorator extends Decorator {
    public HeightUpDecorator(Gamer nextLayer){
        super(nextLayer);
    }

    @Override
    public void getAbility() {
        nextLayer.getAbility();
        System.out.println("height up done");
    }
    
}

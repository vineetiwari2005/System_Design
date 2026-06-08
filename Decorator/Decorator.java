package Decorator;

public abstract class Decorator implements Gamer {
   protected Gamer nextLayer;
    protected Decorator(Gamer nextLayer){
        this.nextLayer=nextLayer;
    }

}

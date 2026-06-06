package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    List<Observer>observers=new ArrayList<>();
    public void register(Observer observer){
        observers.add(observer);
    }
    public void deRegister(Observer observer){
        observers.remove(observer);
    }
    public void notifyChange(){
        for(Observer obv : observers){
            obv.notifyChange();
        }
    }
    
}

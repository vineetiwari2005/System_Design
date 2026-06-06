package Observer;

public class TweetService implements Observer {

    @Override
    public void notifyChange(){
        System.out.println("tweet");
    }
    
}

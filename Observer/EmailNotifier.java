package Observer;

public class EmailNotifier implements Observer {

    @Override
    public void notifyChange() {
        System.out.println("send email");
    }
    
}

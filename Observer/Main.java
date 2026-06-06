package Observer;

public class Main {
    public static void main(String[] args) {
        BitcoinTracker tracker=new BitcoinTracker();
        Observer emailNotifier=new EmailNotifier();
        Observer tweetService=new TweetService();
        tracker.register(emailNotifier);
        tracker.register(tweetService);
        System.out.println("Starting tracking...");
        tracker.SetPrice(40.0); 
        tracker.SetPrice(80.0);
        tracker.SetPrice(150.0);
        tracker.deRegister(tweetService);
        System.out.println("\n(Twitter service deregistered)");
        tracker.SetPrice(90.0);
    }
}
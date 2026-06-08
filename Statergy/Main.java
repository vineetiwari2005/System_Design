package Statergy;

public class Main {
    public static void main(String[] args) {
        Navigator carnNavigator=new Navigator(new CarDrivingStatergy());
        //this acts as an dependecy injection for us 
        carnNavigator.navigate("banglore","mumbai");
        Navigator walkeNavigator=new Navigator(new WalkingStatergy());
        walkeNavigator.navigate("home","park");
        
        
        

        

    }
    
}

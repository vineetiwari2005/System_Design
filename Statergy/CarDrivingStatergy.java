package Statergy;

public class CarDrivingStatergy implements NavigationStatergy {

    @Override
    public void navigate(String from, String to) {
        start();
        System.out.println("navigating using car");
        stop();
    }
    
}

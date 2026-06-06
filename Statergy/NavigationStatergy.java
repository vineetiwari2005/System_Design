package Statergy;

public interface NavigationStatergy {
    void navigate(String from,String to);
    default void start(){
        System.out.println("starting");
    }
    default void stop(){
        System.out.println("stopping");
    }
}

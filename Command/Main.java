package Command;

public class Main {
    public static void main(String[] args) {
        System.out.println("testing the light command now");
        Command lightcommand=new LightCommand(new Light());
       Remote lightremote=new Remote(lightcommand);
       lightremote.ExecuteTheRemote();
       lightremote.RevertBackTheChanges();

       System.out.println("now testing the ac command now");
       Command airCommand=new AirConditionerCommand(new AirConditioner());
       Remote acremote=new Remote(airCommand);
       acremote.ExecuteTheRemote();
       acremote.RevertBackTheChanges();

    }
    
}

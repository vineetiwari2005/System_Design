package Factory;

public class DarkRadio extends Radio {
    public void onSelect(){
        System.out.println("dark radio clicked");

    }

    @Override
    public void render(){
        System.out.println("dark radio rendered");
    }
    
}

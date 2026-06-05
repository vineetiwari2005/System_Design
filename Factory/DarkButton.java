package Factory;

public class DarkButton extends Button {
    private double radius;
    public DarkButton(Double border,Double radius){
        super(border);
        this.radius=radius;
    }
    @Override
    public void onClick(){
        System.out.println("DARK BUTTON WAS CLICKED");
    }
    @Override
    public void render(){
        System.out.println("RENDERED");
    }
     
}

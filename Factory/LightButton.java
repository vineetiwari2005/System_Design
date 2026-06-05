package Factory;

public class LightButton extends Button {
    private Double length;
    public LightButton(Double border,Double length){
        super(border);
        this.length=length;
    }
    @Override
    public void onClick(){
        System.out.println("light button clicked"); 
    }

    @Override
    public void render(){
        System.out.println("RENDERED");
    }
}

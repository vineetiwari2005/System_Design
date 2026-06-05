package Factory;
public abstract class Button{
    private Double border;
    public Button(Double border){
        this.border=border;
    }
    public abstract void onClick();
    public abstract void render(); 
}

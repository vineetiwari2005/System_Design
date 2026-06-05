package FlyWeight;

public class Bullet {
    private String image;
    private Double radius;
    private Double weight;
    private BulletType type;
    public Bullet(String image,Double radius,Double weight,BulletType type){
        this.image=image;
        this.radius=radius;
        this.weight=weight;
        this.type=type;
    }
    public BulletType getType(){
        return type;
    }
    
}

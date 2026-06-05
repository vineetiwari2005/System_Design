package FlyWeight;

public class FlyingBullet {
    private Double x;
    private Double y;
    private Double z;
    private Double direction;
    private Bullet bullet;
    public FlyingBullet(Double x,Double y,Double z,Double direction,Bullet bullet){
        this.x=x;
        this.y=y;
        this.z=z;
        this.direction=direction;
        this.bullet=bullet;
    }
    
    
}

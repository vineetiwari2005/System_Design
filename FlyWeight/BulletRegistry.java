package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType,Bullet>registry=new HashMap<>();
    public void addBullet(Bullet bullet){
        registry.put(bullet.getType(),bullet);
    }
    public Bullet getBullet(BulletType type){
        return registry.get(type);
    }
}

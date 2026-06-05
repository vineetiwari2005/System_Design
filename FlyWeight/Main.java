package FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BulletRegistry registry=new BulletRegistry();
        Bullet nineMm=new Bullet("9mm_image.png",4.5,7.45,BulletType.NINE_MM);
        Bullet acp=new Bullet("acp_image.png", 5.7, 14.9,BulletType.ACP);
        registry.addBullet(nineMm);
        registry.addBullet(acp);
        List<FlyingBullet>flyingBullets=new ArrayList<>();

        System.out.println("--- Firing 9mm Bullets ---");
        for (int i=0;i<3;i++){
            Bullet shared=registry.getBullet(BulletType.NINE_MM);
            FlyingBullet flyingBullet=new FlyingBullet((double) i, 10.0, 0.0, 45.0,shared);
            flyingBullets.add(flyingBullet);
            System.out.println("Fired 9mm Bullet at X: " + i + ". Shared Bullet HashCode: " + shared.hashCode());
        }
        System.out.println("\n--- Firing ACP Bullets ---");
        Bullet sharedAcp=registry.getBullet(BulletType.ACP);
        FlyingBullet flyingAcp=new FlyingBullet(100.0, 50.0, 0.0, 90.0, sharedAcp);
        flyingBullets.add(flyingAcp);
        System.out.println("Fired ACP Bullet at X: 100.0. Shared Bullet HashCode: " + sharedAcp.hashCode());
        System.out.println("\nTotal Flying Bullets in air: " + flyingBullets.size());
    }
}
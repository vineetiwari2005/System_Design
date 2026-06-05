package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BackGroundObjectRegistry registry=new BackGroundObjectRegistry();
        List<Integer>treePixels=generateExpensivePixels("TREE");
        BackGroundObject treePrototype=new BackGroundObject(0, 0, 50, 50, BackgroundObjectType.TREE, treePixels);
        registry.registerObject(treePrototype);

        List<Integer>buildingPixels=generateExpensivePixels("BUILDING");
        BackGroundObject buildingPrototype=new BackGroundObject(0, 0, 200, 300, BackgroundObjectType.BUILDING, buildingPixels);
        registry.registerObject(buildingPrototype);

        System.out.println("\n=== ORIGINAL PROTOTYPES ===");
        treePrototype.print();
        buildingPrototype.print();

        BackGroundObject treeClone1=registry.getObject(BackgroundObjectType.TREE).clone();
        treeClone1.setPosition(100, 200);
        BackGroundObject treeClone2=registry.getObject(BackgroundObjectType.TREE).clone();
        treeClone2.setPosition(250, 350);
        BackGroundObject buildingClone1=registry.getObject(BackgroundObjectType.BUILDING).clone();
        buildingClone1.setPosition(500, 100);
        BackGroundObject buildingClone2=registry.getObject(BackgroundObjectType.BUILDING).clone();
        buildingClone2.setPosition(800, 150);
        System.out.println("\n=== TREE CLONES ===");
        treeClone1.print();
        treeClone2.print();
        System.out.println("\n=== BUILDING CLONES ===");
        buildingClone1.print();
        buildingClone2.print();
    }

    private static List<Integer> generateExpensivePixels(String objectName) {
        System.out.println("Generating expensive pixels for " + objectName + "...");
        List<Integer> pixels = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            pixels.add(random.nextInt(1000));
        }
        return pixels;
    }
}
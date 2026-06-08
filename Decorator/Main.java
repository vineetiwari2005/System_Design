package Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Base Game ---");
        Gamer normalMario=new Mario();
        normalMario.getAbility();
        System.out.println("\n--- Getting a Mushroom (Height Up) ---");
        Gamer tallMario = new HeightUpDecorator(normalMario);
        tallMario.getAbility();
        System.out.println("\n--- Getting a Fire Flower (Gun Power) ---");
        Gamer fireMario = new GunPowerDecorator(tallMario);
        fireMario.getAbility();
        System.out.println("\n--- Getting a Star (Invincibility) ---");
        Gamer ultimateMario = new StarPowerDecorator(new GunPowerDecorator(new HeightUpDecorator(new Mario())));
        ultimateMario.getAbility();
    }
    
}

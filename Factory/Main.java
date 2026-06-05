package Factory;
public class Main {

    public static void main(String[] args) {
        System.out.println("=== LAUNCHING ON DESKTOP ===");
        ScreenSize currentDevice=ScreenSize.DESKTOP;
        ThemeFactory desktopFactory=getFactoryForScreenSize(currentDevice);
        build(desktopFactory);
        System.out.println("\n");

        System.out.println("=== LAUNCHING ON PHONE ===");
        currentDevice=ScreenSize.PHONE;
        ThemeFactory phoneFactory=getFactoryForScreenSize(currentDevice);
        build(phoneFactory);
    }

    private static ThemeFactory getFactoryForScreenSize(ScreenSize size) {
        if(size==ScreenSize.DESKTOP){
            System.out.println("-> Screen is large. Applying Light Theme.");
            return new LightThemeFactory();
        }
        else if(size==ScreenSize.PHONE){
            System.out.println("-> Screen is small. Applying Dark Theme.");
            return new DarkThemedFactory();
        }
        else{
            System.out.println("-> Screen size not explicitly mapped. Defaulting to Light Theme.");
            return new LightThemeFactory();
        }
    }
    private static void build(ThemeFactory factory){
        Button button=factory.createButton(2.0, 5.0, 15.0);
        Radio radio=factory.createRadio();
        button.render();
        button.onClick();
        radio.render();
        radio.onSelect();
    }
}
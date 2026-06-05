package Factory;

public class DarkThemedFactory implements ThemeFactory {

    @Override
    public Button createButton(Double border, Double length, Double radius) {
        return new DarkButton(border, radius);
    }

    @Override
    public Radio createRadio() {
        return new DarkRadio();
    }
    
    
}

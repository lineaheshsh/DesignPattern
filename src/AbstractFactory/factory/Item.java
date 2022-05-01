package AbstractFactory.factory;

/**
 * 추상적인 부품 : Item 클래스
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}

package AbstractFactory.factory;

/**
 * 추상적인 부품 : Link 클래스
 */
public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

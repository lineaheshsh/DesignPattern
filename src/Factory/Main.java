package Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("Lee");
        Product p2 = factory.create("Kim");
        Product p3 = factory.create("Yoo");

        p1.use();
        p2.use();
        p3.use();
    }
}

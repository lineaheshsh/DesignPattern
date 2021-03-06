package AbstractFactory.factory;

/**
 * 추상적인 공장 : Factory 클래스
 */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 " + classname + " 이 발견되지 않았습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}

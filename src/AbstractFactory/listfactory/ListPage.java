package AbstractFactory.listfactory;

import AbstractFactory.factory.Item;
import AbstractFactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><head><title>" + title + "</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>" + title + "</h1>\n");
        sb.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>" + author + "</address>");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}

package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Git 교과서"));
        bookShelf.appendBook(new Book("엘라스틱서치 실무 가이드"));
        bookShelf.appendBook(new Book("카프카 핵심 가이드"));
        bookShelf.appendBook(new Book("배민다움"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}

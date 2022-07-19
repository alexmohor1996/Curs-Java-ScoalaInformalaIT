import java.util.*;

public class BookCatalog {

    private final ArrayList<Book> books = new ArrayList();

    public void Add(Book book)
    {
        books.add(book);
    }

    public Book Buy(int index)
    {
        return books.remove(index);
    }

    public void PrintStatistics()
    {
        System.out.println(books);
    }

}

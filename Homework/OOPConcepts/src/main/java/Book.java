public class Book {

    private final String name;
    private final int page_number;

    public Book(String name, int page_number)
    {
        this.name = name;
        this.page_number = page_number;
    }

    public String getName()
    {
        return name;
    }

    public int getPageNumber()
    {
        return page_number;
    }

    @Override
    public String toString()
    {
        return name;
    }

}

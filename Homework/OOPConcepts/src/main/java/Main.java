import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CatalogOfBooks();
        AddExample();

    }

    private static void CatalogOfBooks()
    {
        Book JaneEyre = new Book("Jane Eyre", 5513);
        Book WutheringHeights = new Book("Wuthering Heights", 1212);
        Book TheVelvet = new Book("The Velvet", 1041);
        Book TheRollingStones = new Book("The Rolling Stones", 12512);

        BookCatalog catalog = new BookCatalog();

        catalog.Add(JaneEyre);
        catalog.Add(WutheringHeights);
        catalog.Add(TheVelvet);
        catalog.Add(TheRollingStones);

        catalog.PrintStatistics();

        Book book = catalog.Buy(1);

        System.out.println("I have purchased the book " + book.getName() + " which has " + book.getPageNumber() + " pages");

        catalog.PrintStatistics();
    }

    private static void AddExample() {
        Novel JaneEyre = new Novel("Jane Eyre", 5513);
        Novel WutheringHeights = new Novel("Wuthering Heights", 1212);

        ArtAlbums TheVelvet = new ArtAlbums("The Velvet", 1041);
        ArtAlbums TheRollingStones = new ArtAlbums("The Rolling Stones", 12512);

        ArrayList<Novel> m_novels = new ArrayList<>();
        m_novels.add(JaneEyre);
        m_novels.add(WutheringHeights);

        ArrayList<ArtAlbums> m_albums = new ArrayList();
        m_albums.add(TheVelvet);
        m_albums.add(TheRollingStones);

        StandardCatalog<Book> catalog = new StandardCatalog<>();
        catalog.AddMany(m_novels);
        catalog.AddMany(m_albums);

        catalog.printStatistics();
    }

}

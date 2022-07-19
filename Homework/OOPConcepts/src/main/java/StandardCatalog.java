import java.util.ArrayList;
import java.util.List;

public class StandardCatalog <I> {
    private final ArrayList<I> items = new ArrayList<>();

    public void AddMany(List<? extends I> itemsToAdd) {
        items.addAll(itemsToAdd);
    }

    public void add(I item) {
        items.add(item);
    }

    public I buy() {
        return items.remove(0);
    }

    public void printStatistics() {
        System.out.println(items);
    }

}

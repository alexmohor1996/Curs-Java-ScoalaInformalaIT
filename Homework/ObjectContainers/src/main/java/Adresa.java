import java.util.ArrayList;
import java.util.List;

public class Adresa {

    String name;

    public Adresa(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name;
    }

}

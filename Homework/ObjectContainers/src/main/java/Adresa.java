import java.util.ArrayList;

public class Adresa {

    String name;

    public Adresa(String name)
    {
        this.name = name;
    }

    public void AddAddress(String name)
    {
        ArrayList<Adresa> address = new ArrayList<>();
        address.add(new Adresa(name));
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

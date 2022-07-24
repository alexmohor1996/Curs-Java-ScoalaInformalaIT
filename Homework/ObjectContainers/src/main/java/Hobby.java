import java.util.ArrayList;
import java.util.List;

public class Hobby {

    String name;
    int frequency;
    List<Adresa> adresa = new ArrayList<>();

    public Hobby(String name, int frequency, List<Adresa> adresa)
    {
        this.name = name;
        this.frequency = frequency;
        this.adresa = adresa;

    }

    public String getName()
    {
        return name;
    }

    public int getFrequency()
    {
        return frequency;
    }

    public List<Adresa> getAdresa()
    {
        return adresa;
    }

    @Override
    public String toString()
    {
        return name + ", " + frequency + " times available in a week, " + adresa;
    }


}

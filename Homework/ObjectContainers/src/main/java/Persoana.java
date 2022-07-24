import java.util.Objects;

public class Persoana implements Comparable<Persoana> {

    private String name;
    private int age;

    public Persoana(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }

        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Persoana pr = (Persoana) o;
        return Objects.equals(name, pr.name) && Objects.equals(age, pr.age);

    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Persoana p)
    {
        return -this.name.compareTo(p.name);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        sb.append(name).append(", ").append(age);
        return sb.toString();
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

}

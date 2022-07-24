import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persoana p1 = new Persoana("Alex", 25);
        Persoana p2 = new Persoana("Mada", 26);
        Persoana p3 = new Persoana("Andrei", 27);

        Set<Persoana> personSet = new TreeSet<Persoana>();


        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);


        Iterator<Persoana> itr = personSet.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        HashMap<Persoana, List<Hobby>> hobbies = new HashMap<Persoana, List<Hobby>>();

        hobbies.put(p1, )

    }

}

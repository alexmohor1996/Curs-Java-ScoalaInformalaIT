import java.util.*;

public class Main {
    public static void main(String[] args) {

        Persoana p1 = new Persoana("Alex", 25);
        Persoana p2 = new Persoana("Mada", 26);
        Persoana p3 = new Persoana("Andrei", 26);
        Persoana p4 = new Persoana("Mugur", 27);

        Set<Persoana> personSet = new TreeSet<>();

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);

        Iterator<Persoana> itr = personSet.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        Adresa a1 = new Adresa("Romania: Parcul Tineretului");
        Adresa a2 = new Adresa("Romania: Parcul IOR");
        Adresa a3 = new Adresa("SUA: National Park Death Valley");
        Adresa a4 = new Adresa("SUA: National Park Jewel Cave");
        Adresa a5 = new Adresa("Germany: Rosenhoehe Park");
        Adresa a6 = new Adresa("Germany: Westfalen Park");
        Adresa a7 = new Adresa("Spain: Gorbea Natural Park");
        Adresa a8 = new Adresa("Spain: Montseny Natural Park");
        Adresa a9 = new Adresa("France: Champ de Mars Park");
        Adresa a10 = new Adresa("France: Belleville Park");
        Adresa a11 = new Adresa("Netherlands: Vondel Park");
        Adresa a12 = new Adresa("Netherlands: Haagse Bos Park");
        Adresa a13 = new Adresa("Sweden: Keillers Park");
        Adresa a14 = new Adresa("Sweden: Vanortsparken Park");
        Adresa a15 = new Adresa("Austria: Gesäuse Park");
        Adresa a16 = new Adresa("Austria: Thayatal Park");

        List<Adresa> adresaSet1 = new ArrayList<>();
        List<Adresa> adresaSet2 = new ArrayList<>();
        List<Adresa> adresaSet3 = new ArrayList<>();
        List<Adresa> adresaSet4 = new ArrayList<>();
        List<Adresa> adresaSet5 = new ArrayList<>();
        List<Adresa> adresaSet6 = new ArrayList<>();
        List<Adresa> adresaSet7 = new ArrayList<>();
        List<Adresa> adresaSet8 = new ArrayList<>();


        adresaSet1.add(a1);
        adresaSet1.add(a2);

        adresaSet2.add(a3);
        adresaSet2.add(a4);

        adresaSet3.add(a5);
        adresaSet3.add(a6);

        adresaSet4.add(a7);
        adresaSet4.add(a8);

        adresaSet5.add(a9);
        adresaSet5.add(a10);

        adresaSet6.add(a11);
        adresaSet6.add(a12);

        adresaSet7.add(a13);
        adresaSet7.add(a14);

        adresaSet8.add(a15);
        adresaSet8.add(a16);

        Hobby h1 = new Hobby("Ciclism", 5, adresaSet1);
        Hobby h2 = new Hobby("Role", 6, adresaSet2);
        Hobby h3 = new Hobby("Skate", 2, adresaSet3);
        Hobby h4 = new Hobby("IceSkate", 5, adresaSet4);
        Hobby h5 = new Hobby("Mountain Climb", 8, adresaSet5);
        Hobby h6 = new Hobby("Diving", 9, adresaSet6);
        Hobby h7 = new Hobby("Jumping", 5, adresaSet7);
        Hobby h8 = new Hobby("Sky Diving", 8, adresaSet8);

        List<Hobby> hobbySet1 = new ArrayList<>();
        List<Hobby> hobbySet2 = new ArrayList<>();
        List<Hobby> hobbySet3 = new ArrayList<>();
        List<Hobby> hobbySet4 = new ArrayList<>();

        hobbySet1.add(h1);
        hobbySet1.add(h2);

        hobbySet2.add(h3);
        hobbySet2.add(h4);

        hobbySet3.add(h5);
        hobbySet3.add(h6);

        hobbySet4.add(h7);
        hobbySet4.add(h8);

        Map<Persoana, List<Hobby>> new_map = new HashMap<>();

        new_map.put(p1, hobbySet1);
        new_map.put(p2, hobbySet2);
        new_map.put(p3, hobbySet3);
        new_map.put(p4, hobbySet4);

        for (Map.Entry<Persoana, List<Hobby>> set : new_map.entrySet())
        {
            System.out.println(set.getKey() + " -> " + set.getValue());
        }

    }

}
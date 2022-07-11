import java.util.ArrayList;

public class SamsungS20Ultra extends Samsung{


    private static final ArrayList<Contact> contacts = new ArrayList<>();
    static void addContacts(int index, long phone, String first_name, String last_name)
    {
        Contact contact = new Contact(index, phone, first_name, last_name);

        SamsungS20Ultra s = new SamsungS20Ultra();

        s.add(contact);

    }
    public void add(Contact contact)
    {
        contacts.add(contact);
    }

    public void list()
    {
        System.out.println(contacts);
    }




}

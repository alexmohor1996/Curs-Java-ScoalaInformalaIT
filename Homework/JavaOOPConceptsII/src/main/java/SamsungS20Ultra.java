import java.util.ArrayList;
import java.util.List;

public class SamsungS20Ultra extends Samsung{


    public final List<Contact> contacts = new ArrayList<Contact>();
    //static void addContacts(int index, long phone, String first_name, String last_name)
    //{
    //    Contact contact = new Contact(index, phone, first_name, last_name);
//
    //    SamsungS20Ultra s = new SamsungS20Ultra();
//
    //    s.add(contact);
//
    //}
    public void add(Contact contact)
    {
        contacts.add(contact);
    }

    public void list()
    {

    }





}

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Phone implements Device {

    public void Call()
    {
        System.out.println("Calling...");
    }

    @Override
    public void Sms() {

    }


    public final ArrayList<Contact> contacts = new ArrayList<>();
    void AddContacts(int index, long phone, String first_name, String last_name)
    {
        Contact contact = new Contact(index, phone, first_name, last_name);

        contacts.add(contact);

    }

    public void Sms(int number, String message)
    {
        Scanner sc = new Scanner(System.in);
        int char_length = 500;

        if (message.length() > char_length)
        {
            System.out.println("Maximum message characters length is 500 !");
        }

        while (message == " " || message.length() <= char_length)
        {
            message = sc.nextLine();

        }
        System.out.println("Message " + message + "sent to " + number);
    }

    public void Call(int number)
    {
        System.out.println("Calling " + number);
    }

    public void ListContacts()
    {
        System.out.println(contacts);
    }

    public void ListMessages()
    {

    }

    public void ViewHistory()
    {

    }

}

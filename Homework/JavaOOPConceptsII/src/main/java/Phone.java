import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Phone implements Device {

    int index;
    String phone_number;
    String first_name;
    String last_name;

    public void Call()
    {
        System.out.println("Calling...");
    }

    @Override
    public void Sms() {

    }
    ArrayList<Contact> contacts = new ArrayList<>();
    public void AddContacts(int index, String phone_number, String first_name, String last_name)
    {
        contacts.add(new Contact(index, phone_number, first_name, last_name));
    }

    public void ListContacts()
    {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void Sms(int number, String message)
    {
        Scanner sc = new Scanner(System.in);
        int char_length = 500;

        if (message.length() > char_length)
        {
            System.out.println("Maximum message characters length is 500 !");
        }

        while (Objects.equals(message, " ") || message.length() <= char_length)
        {
            message = sc.nextLine();

        }
        System.out.println("Message " + message + "sent to " + number);
    }



}

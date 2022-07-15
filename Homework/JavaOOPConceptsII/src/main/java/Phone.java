import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Phone implements Device {

    int index;
    String phone_number;
    String first_name;
    String last_name;
    final int message_length = 500;




    public void Call()
    {

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

    ArrayList<Sms> msg = new ArrayList<>();
    public void SendMessage(String phone_number, String message)
    {
        if (message.length() > 500)
        {
            System.out.println("You cannot have more than 5 characters in the message");
            return;
        }
        msg.add(new Sms(phone_number, message));
        System.out.println("Sending message \" " + msg + " \" to :" + phone_number);
    }

    public void ListMessages(String phone_number)
    {
        for (Sms mesg : msg)
        {
            System.out.println("Messages History: ");
            System.out.println(phone_number + ": " + mesg);
        }
    }

    ArrayList<Calling> calls = new ArrayList<>();
    public void Call(String phone_number)
    {
        calls.add(new Calling(phone_number));
        System.out.println();
        System.out.println("Calling.. " + calls);
    }

    public void ViewHistory()
    {
        for (Calling call : calls)
        {
            System.out.println("Calling History: ");
            System.out.println(call);
        }
    }


}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Phone phone = new SamsungS20Ultra();
        phone.AddContacts(1, "+40722505037", "Alex", "Mohor");
        phone.AddContacts(2, "+40721251251", "Andrei", "Matei");
        phone.AddContacts(3, "+40751581395", "Ana", "Maria");
        phone.AddContacts(4, "+40725129511", "Andreea", "Manta");

        phone.ListContacts();

        System.out.println();
        phone.SendMessage("+40722505037", "This is a message to the first contact in the list");
        phone.ListMessages("+40722505037");

        System.out.println();

        phone.SendMessage("+40721251251", "This is a message to the second contact in the list");

        phone.Call("+40721251251");
        phone.ViewHistory();

    }



}

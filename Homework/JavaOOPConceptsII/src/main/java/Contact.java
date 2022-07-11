public class Contact {
    private final int index;
    private final long phone_number;
    private final String first_name;
    private final String last_name;

    public Contact(int index, long phone_number, String first_name, String last_name)
    {
        this.index = index;
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int GetIndex()
    {
        return index;
    }

    public long GetPhoneNumber()
    {
        return phone_number;
    }

    public String GetFirstName()
    {
        return first_name;
    }

    public String GetLastName()
    {
        return last_name;
    }

}

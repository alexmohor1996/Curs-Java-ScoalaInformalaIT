public class Contact {

    int index;
    String phone_number;
    String first_name;
    String last_name;

    Contact(int index, String phone_number, String first_name, String last_name)
    {
        this.index = index;
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getIndex()
    {
        return this.index;
    }

    public String getPhoneNumber()
    {
        return this.phone_number;
    }

    public String getFirstName()
    {
        return this.first_name;
    }

    public String getLastName()
    {
        return this.last_name;
    }

    @Override
    public String toString()
    {
        return this.index + ". " + "Name: " + this.first_name + "/ Last Name: " + this.last_name + "/ Phone: " + this.phone_number;
    }

}

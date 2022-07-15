public class Calling {

    String phone_number;

    public Calling(String phone_number)
    {
        this.phone_number = phone_number;
    }

    public String getPhoneNumber()
    {
        return this.phone_number;
    }

    @Override
    public String toString()
    {
        return this.phone_number;
    }

}

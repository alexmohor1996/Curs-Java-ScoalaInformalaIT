public class Sms {

    String phone_number;
    String message;

    public Sms(String phone_number, String message)
    {
        this.phone_number = phone_number;
        this.message = message;
    }

    public String getPhoneNumber()
    {
        return this.phone_number;
    }

    public String getMessaage()
    {
        return this.message;
    }

    @Override
    public String toString()
    {
        return this.message;
    }
}

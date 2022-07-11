public class Main {

    public static void main(String[] args) {

        Phone phone = new SamsungS20Ultra();

        phone.AddContacts(1, 123456, "Alexandru" ,"Gheorghe");
        phone.AddContacts(2, 2222422, "Andrei", "Razvan");

        phone.ListContacts();
        phone.Sms(123456, "odafjeowifoiewgoirjoigjoairjgoiaejriguaneriuofgahouiwerhoaeurhvouaierhgoaeyrofwayugroauyergoaeuyrghoaieuyrghoaeiuyrghoaieyrghoiaeyrghoiaeyrgoiayeurghoaiyegrhoiyaegrhoiyaehrogyiaehroigyuaehoriygaeoirygoaieyrgoaieuyrghofaeuiyrghoaeiury");

    }



}

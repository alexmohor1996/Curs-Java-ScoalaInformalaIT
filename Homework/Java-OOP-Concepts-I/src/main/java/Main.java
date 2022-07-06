public class Main {

    public static void main(String[] args) {

        Car car1 = new Logan(100.00, "8WHFJ52WHFW581219");
        Car car2 = new Skoda(100.00, "1HGBH41JXMN109186");

        car1.start();

        car1.shiftGear(1);

        car1.drive(0.01);// drives 0.01 KMs

        car1.shiftGear(2);

        car1.drive(0.02);

        car1.shiftGear(3);

        car1.drive(0.5);

        car1.shiftGear(4);

        car1.drive(0.5);

        car1.shiftGear(4);

        car1.drive(0.5);

        car1.shiftGear(5);

        car1.drive(10);

        car1.shiftGear(4);

        car1.drive(0.5);

        car1.shiftGear(3);

        car1.drive(0.1);

        car1.stop();

    }

}

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();


        Car car = new Dacia();
        Car car2 = new Skoda();

        cars.add(new Logan(100.00, "8WHFJ52WHFW581219" ));
        cars.add(new Duster(150, "1JF)#JFJ#())FJ)#JF#"));
        cars.add(new Octavia(100.00, "1HGBH41JXMN109186"));
        cars.add(new Superb(120, "9JF1390JF1039JF3FJ"));

        for (Car v: cars)
        {
            if (v instanceof Logan)
            {
                v.start();
                ((Logan) v).shiftGear(1);
                ((Logan) v).drive(0.01);
                ((Logan) v).shiftGear(2);
                ((Logan) v).drive(0.02);
                ((Logan) v).shiftGear(3);
                ((Logan) v).drive(0.5);
                ((Logan) v).shiftGear(4);
                ((Logan) v).drive(0.5);
                ((Logan) v).shiftGear(4);
                ((Logan) v).drive(0.5);
                ((Logan) v).shiftGear(5);
                ((Logan) v).drive(10);
                System.out.println();
            }
            else if (v instanceof Duster)
            {
                v.start();
                ((Duster) v).shiftGear(1);
                ((Duster) v).drive(0.01);
                ((Duster) v).shiftGear(2);
                ((Duster) v).drive(0.02);
                ((Duster) v).shiftGear(3);
                ((Duster) v).drive(0.5);
                ((Duster) v).shiftGear(4);
                ((Duster) v).drive(0.5);
                ((Duster) v).shiftGear(4);
                ((Duster) v).drive(0.5);
                ((Duster) v).shiftGear(5);
                ((Duster) v).drive(10);
                System.out.println();
            }
            else if (v instanceof Octavia)
            {
                v.start();
                ((Octavia) v).shiftGear(1);
                ((Octavia) v).drive(0.01);
                ((Octavia) v).shiftGear(2);
                ((Octavia) v).drive(0.02);
                ((Octavia) v).shiftGear(3);
                ((Octavia) v).drive(0.5);
                ((Octavia) v).shiftGear(4);
                ((Octavia) v).drive(0.5);
                ((Octavia) v).shiftGear(4);
                ((Octavia) v).drive(0.5);
                ((Octavia) v).shiftGear(5);
                ((Octavia) v).drive(10);
                System.out.println();
            }
            else if (v instanceof Superb)
            {
                v.start();
                ((Superb) v).shiftGear(1);
                ((Superb) v).drive(0.01);
                ((Superb) v).shiftGear(2);
                ((Superb) v).drive(0.02);
                ((Superb) v).shiftGear(3);
                ((Superb) v).drive(0.5);
                ((Superb) v).shiftGear(4);
                ((Superb) v).drive(0.5);
                ((Superb) v).shiftGear(4);
                ((Superb) v).drive(0.5);
                ((Superb) v).shiftGear(5);
                ((Superb) v).drive(10);
                System.out.println();
            }
        }

    }

}

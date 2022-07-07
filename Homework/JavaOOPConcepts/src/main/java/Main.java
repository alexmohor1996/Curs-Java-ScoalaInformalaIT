import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        //Car car1 = new Logan(100.00, "8WHFJ52WHFW581219");
        //Car car2 = new Skoda(100.00, "1HGBH41JXMN109186");

        cars.add(new Logan(100.00, "8WHFJ52WHFW581219" ));
        cars.add(new Skoda(100.00, "1HGBH41JXMN109186"));

        for (Car v: cars)
        {
            if (v instanceof Logan)
            {
                v.start();
                ((Logan) v).ConsumptionTrackingBetweenStartAndStop();
                ((Logan) v).shiftGear(1);
            }
            else if (v instanceof Skoda)
            {
                v.start();
            }
        }

    }

}

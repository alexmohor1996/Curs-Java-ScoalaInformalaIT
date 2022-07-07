import java.sql.SQLOutput;

public class Logan extends Dacia{

    final int fuelTankSize = 50;
    String fuelType = "Petrol";
    int gears = 5;
    final double consumptionPer100KM = 6.7;
    double availableFuel = 50;
    int tireSize;

    Logan(double fuel, String chassis)
    {
        this.availableFuel = fuel;
        this.chassisNumber = chassis;
    }

    int gear;

    public void start()
    {
        System.out.println("The car Logan has started");
    }

    public void drive(double km)
    {
        System.out.println("The car Logan is driving " + km + " kilometers");
    }

    public void stop()
    {
        System.out.println("The car Logan has stopped");
    }

    public void shiftGear(int gear)
    {
        //String gearOut = (gear == 1) ? "st gear" : (gear == 2) ? "nd gear" : (gear == 3) ? "rd gear" : "th gear";
        //System.out.println("The car Logan is in the " + gear + gearOut);
        /*switch(gear)
        {
            case 1:
                System.out.println("The car Logan is in the first gear");
                ConsumptionTrackingBetweenStartAndStop(0.02);
                break;
            default:
                System.out.println("The car is standing");
        }*/

        if (gear == 1)
        {
            System.out.println("The car Logan is in the first gear");
            ConsumptionTrackingBetweenStartAndStop();
        }
    }

    public double ConsumptionTrackingBetweenStartAndStop()
    {
        double cons = 0;

       switch(gear)
        {
            case 1:
                cons = consumptionPer100KM - 0.02;
               // System.out.println("The car is consuming" + cons);
                break;
            case 2:
                cons = consumptionPer100KM - 0.04;
                //System.out.println("The car is consuming" + cons);
                break;
            case 3:
                cons = consumptionPer100KM - 0.06;
               // System.out.println("The car is consuming" + cons);
                break;
            case 4:
                cons = consumptionPer100KM - 0.08;
               // System.out.println("The car is consuming" + cons);
                break;
            case 5:
                cons = consumptionPer100KM - 0.1;
              //  System.out.println("The car is consuming" + cons);
                break;
            default:
              //  System.out.println("The car is not yet consuming");
                break;
        }

        /*if (gear == 1)
        {
            cons = consumptionPer100KM - 0.02;
        }*/

        System.out.println("The car is consuming " + cons);
        return cons;
    }

}

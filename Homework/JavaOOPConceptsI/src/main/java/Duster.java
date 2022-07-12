public class Duster extends Dacia{

    final int fuelTankSize = 120;
    String fuelType = "Diesel";
    int gears = 5;
    final double consumptionPer100KM = 3.4;
    double availableFuel = 120;
    int tireSize;
    String chassisNumber;

    Duster(double fuel, String chassis)
    {
        this.availableFuel = fuel;
        this.chassisNumber = chassis;
    }

    int gear;

    public void start()
    {
        System.out.println("Duster has started");
    }

    public void drive(double km)
    {
        System.out.println("Duster is driving " + km + " kilometers");
    }

    public void stop()
    {
        System.out.println("Duster has stopped");
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
            System.out.println("Duster is in the first gear");
            ConsumptionTrackingBetweenStartAndStop(1);
        }
        else if (gear == 2)
        {
            System.out.println("Duster is in the second gear");
            ConsumptionTrackingBetweenStartAndStop(2);
        }
        else if (gear == 3)
        {
            System.out.println("Duster is in the third gear");
            ConsumptionTrackingBetweenStartAndStop(3);
        }
        else if (gear == 4)
        {
            System.out.println("Duster is in the fourth gear");
            ConsumptionTrackingBetweenStartAndStop(4);
        }
        else if (gear == 5)
        {
            System.out.println("Duster is in the fifth gear");
            ConsumptionTrackingBetweenStartAndStop(5);
        }
    }

    public void Consumption(int interKM)
    {

    }

    public void ConsumptionTrackingBetweenStartAndStop(int gear)
    {
        double cons = 0;

        switch (gear) {
            case 1 -> cons = consumptionPer100KM - (consumptionPer100KM * 0.02);

            // System.out.println("The car is consuming" + cons);
            case 2 -> cons = consumptionPer100KM - (consumptionPer100KM * 0.04);
            //System.out.println("The car is consuming" + cons);

            case 3 -> cons = consumptionPer100KM - (consumptionPer100KM * 0.06);

            // System.out.println("The car is consuming" + cons);
            case 4 -> cons = consumptionPer100KM - (consumptionPer100KM * 0.08);

            // System.out.println("The car is consuming" + cons);
            case 5 -> cons = consumptionPer100KM - (consumptionPer100KM * 0.1);

            //  System.out.println("The car is consuming" + cons);
            default -> {
            }
            //  System.out.println("The car is not yet consuming");
        }

        /*if (gear == 1)
        {
            cons = consumptionPer100KM - 0.02;
        }*/

        System.out.println("Duster is consuming " + cons);
    }

}

public abstract class Car implements Vehicle{

    double availableFuel;
    String chassisNumber;

    int gear;

    public void start()
    {
        System.out.println("The car has started");
    }

    public void drive(double km)
    {
        System.out.println("The car is driving " + km + " kilometers");
    }

    public void stop()
    {
        System.out.println("The car has stopped");
    }

    public void shiftGear(int gear)
    {
        String gearOut = (gear == 1) ? "st gear" : (gear == 2) ? "nd gear" : (gear == 3) ? "rd gear" : "th gear";
        System.out.println("The car is in the " + gear + gearOut);
    }

    public double ConsumptionTrackingBetweenStartAndStop(double cons)
    {

        switch(gear)
        {
            case 1:
                System.out.println();
        }

        return cons;
    }

}

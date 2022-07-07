public class Skoda extends Dacia{

    final int fuelTankSize = 70;
    final String fuelType = "Diesel";
    final int gears = 6;
    final double consumptionPer100KM = 4.5;
    double availableFuel = 70;
    int tireSize;

    Skoda(double fuel, String chassis)
    {
        this.availableFuel = fuel;
        this.chassisNumber = chassis;
    }

    public void start()
    {
        System.out.println("The car Skoda has started");
    }

    public void drive(double km)
    {
        System.out.println("The car Skoda is driving " + km + " kilometers");
    }

    public void stop()
    {
        System.out.println("The car Skoda has stopped");
    }

    public void shiftGear(int gear)
    {
        String gearOut = (gear == 1) ? "st gear" : (gear == 2) ? "nd gear" : (gear == 3) ? "rd gear" : "th gear";
        System.out.println("The car Skoda is in the " + gear + gearOut);
    }

}

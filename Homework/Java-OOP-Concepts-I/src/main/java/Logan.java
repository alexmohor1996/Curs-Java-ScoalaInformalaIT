public class Logan extends Dacia{

    final int fuelTankSize = 50;
    String fuelType = "Petrol";
    final int gears = 5;
    final double consumptionPer100KM = 6.7;
    double availableFuel = 50;
    int tireSize;

    Logan(double fuel, String chassis)
    {
        this.availableFuel = fuel;
        this.chassisNumber = chassis;
    }



}

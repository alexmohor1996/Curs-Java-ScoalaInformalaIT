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

}

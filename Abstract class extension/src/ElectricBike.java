
public class ElectricBike extends ElectricVehicle {


    @Override
    public String batteryType() {
        return "Nickel-metal hydride battery";
    }


    public void ride() {
        System.out.println("Riding the electric bike.");
    }
}

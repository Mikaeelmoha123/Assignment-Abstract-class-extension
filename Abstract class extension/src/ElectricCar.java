
public class ElectricCar extends ElectricVehicle {


    @Override
    public String batteryType() {
        return "Lithium-ion battery";
    }

    public void drive() {
        System.out.println("Driving the electric car.");
    }
}

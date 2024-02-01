
public class ElectricVehiclePrototype {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        ElectricBike electricBike = new ElectricBike();

        System.out.println("Electric Car Battery Type: " + electricCar.batteryType());
        electricCar.charge();
        electricCar.drive();

        System.out.println();


        System.out.println("Electric Bike Battery Type: " + electricBike.batteryType());
        electricBike.charge();
        electricBike.ride();
    }
}

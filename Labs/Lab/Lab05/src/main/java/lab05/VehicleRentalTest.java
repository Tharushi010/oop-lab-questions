
package lab05;

public class VehicleRentalTest {
    
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR101", "Toyota", 5, 4000);
        Vehicle vehicle2 = new Bike("BIKE202", "Honda", 10, 500);

        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println("----------------------");

        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());
    }
}

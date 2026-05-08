
package lab05;

public class Car extends Vehicle {
    
    private int numberOfDays;
    private double dailyRate;

    
    Car(String vehicleNumber, String brand, int numberOfDays, double dailyRate) {
        super(vehicleNumber, brand);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost() {
        super.calculateRentalCost();

        return numberOfDays * dailyRate;
    }
}


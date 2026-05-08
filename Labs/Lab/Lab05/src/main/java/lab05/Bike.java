
package lab05;

class Bike extends Vehicle{
    
    private int numberOfHours;
    private double hourlyRate;

    Bike(String vehicleNumber, String brand, int numberOfHours, double hourlyRate) {
        super(vehicleNumber, brand);
        this.numberOfHours = numberOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateRentalCost() {

        super.calculateRentalCost();

        return numberOfHours * hourlyRate;
    }
}

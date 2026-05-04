
package lab05;

public class DeliveryChargeTest {
    public static void main(String[] args) {
    DeliveryChargeCalculator calc = new DeliveryChargeCalculator();
    
        System.out.println("Base Charge Only: " + calc.calculateCharge(1000));

        System.out.println("Base + Distance: " + 
            calc.calculateCharge(1000, 5));

        System.out.println("Base + Distance + Weight: " + 
            calc.calculateCharge(1000, 5, 2));

        System.out.println("Base + Express Only: " + 
            calc.calculateCharge(1000, true));

        System.out.println("Full Charge (Base + Distance + Weight + Express): " + 
            calc.calculateCharge(1000, 5, 2, true));
    }
}
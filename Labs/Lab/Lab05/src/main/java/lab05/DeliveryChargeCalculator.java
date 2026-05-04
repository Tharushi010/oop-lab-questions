
package lab05;

public class DeliveryChargeCalculator {
   double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    double calculateCharge(double baseCharge, double distanceKm) {
        double distanceCharge = distanceKm * 100.0;
        return baseCharge + distanceCharge;
    }

    double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        double distanceCharge = distanceKm * 100.0;
        double weightCharge = weightKg * 50.0;
        return baseCharge + distanceCharge + weightCharge;
    }

    double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0;
        }
        return baseCharge;
    }

    double calculateCharge(double baseCharge, double distanceKm, double weightKg, boolean expressDelivery) {
        double total = calculateCharge(baseCharge, distanceKm, weightKg);

        if (expressDelivery) {
            total += 500.0;
        }

        return total;
    }
}

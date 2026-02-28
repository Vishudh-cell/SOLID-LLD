// Strategy interface
interface ShippingStrategy {
    double calculateCost(double weight);
}

// Concrete strategies
class StandardShipping implements ShippingStrategy {
    public double calculateCost(double weight) {
        return weight * 1.5;
    }
}

class ExpressShipping implements ShippingStrategy {
    public double calculateCost(double weight) {
        return weight * 3.0;
    }
}

class OvernightShipping implements ShippingStrategy {
    public double calculateCost(double weight) {
        return weight * 5.0;
    }
}

class InternationalShipping implements ShippingStrategy {
    public double calculateCost(double weight) {
        return weight * 10.0;
    }
}

// Calculator now depends on abstraction
class ShippingCostCalculator {
    private ShippingStrategy strategy;

    public ShippingCostCalculator(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double weight) {
        return strategy.calculateCost(weight);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ShippingCostCalculator standardCalc =
            new ShippingCostCalculator(new StandardShipping());
        System.out.println("Standard: $" + standardCalc.calculate(2.0));

        ShippingCostCalculator expressCalc =
            new ShippingCostCalculator(new ExpressShipping());
        System.out.println("Express: $" + expressCalc.calculate(2.0));

        ShippingCostCalculator expressCal =
            new ShippingCostCalculator(new OvernightShipping());
        System.out.println("Overnight: $" + expressCal.calculate(2.0));

        ShippingCostCalculator expressCa =
            new ShippingCostCalculator(new InternationalShipping());
        System.out.println("International: $" + expressCa.calculate(2.0));
    }
}

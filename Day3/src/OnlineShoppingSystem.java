// Abstract class Product
abstract class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();
}

// Electronics class extending Product
class Electronics extends Product {
    public Electronics(double price) {
        super(price);
    }

    // Custom discount logic for Electronics
    @Override
    public double calculateDiscount() {
        return price * 0.10;  // 10% discount for electronics
    }
}

// Clothing class extending Product
class Clothing extends Product {
    public Clothing(double price) {
        super(price);
    }

    // Custom discount logic for Clothing
    @Override
    public double calculateDiscount() {
        return price * 0.05;  // 5% discount for clothing
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Creating product objects
        Product phone = new Electronics(50000);
        Product shirt = new Clothing(2000);

        // Calculating and displaying discount
        System.out.println("Phone Discount: " + phone.calculateDiscount());  // 10% discount for electronics
        System.out.println("Shirt Discount: " + shirt.calculateDiscount());  // 5% discount for clothing
    }
}

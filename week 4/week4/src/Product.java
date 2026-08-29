public class Product {

    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    private static int productCounter = 0;

    // Constructor with zero quantity
    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    // Constructor with quantity
    public Product(String code, String name, double unitPrice, int quantity) {

        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

        productCounter++;
    }

    public void restock(int amount) {

        if (amount > 0) {
            quantity = quantity + amount;
        }
    }

    public boolean sell(int amount) {

        if (amount > 0 && amount <= quantity) {
            quantity = quantity - amount;
            return true;
        }

        return false;
    }

    public double getInventoryValue() {
        return unitPrice * quantity;
    }

    public static int getProductCount() {
        return productCounter;
    }

    public String toString() {
        return "Code: " + code +
               ", Name: " + name +
               ", Price: " + unitPrice +
               ", Quantity: " + quantity +
               ", Inventory Value: " + getInventoryValue();
    }
}
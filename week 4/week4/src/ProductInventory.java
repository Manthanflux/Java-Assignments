public class ProductInventory {

    public static void main(String[] args) {

        Product p1 = new Product("P101", "Laptop", 50000);
        Product p2 = new Product("P102", "Mouse", 500, 10);
        Product p3 = new Product("P103", "Keyboard", 1000, 5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\nRestocking Laptop:");
        p1.restock(2);
        System.out.println(p1);

        System.out.println("\nSelling Mouse:");
        System.out.println(p2.sell(3));
        System.out.println(p2);

        System.out.println("\nTrying to sell unavailable quantity:");
        System.out.println(p3.sell(10));

        System.out.println("\nTotal products: " + Product.getProductCount());
    }
}
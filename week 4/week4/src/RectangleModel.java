public class RectangleModel {

    public static void main(String[] args) {

        System.out.println("Creating rectangle using no argument:");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        System.out.println("\nCreating square:");
        Rectangle r2 = new Rectangle(5);
        System.out.println(r2);

        System.out.println("\nCreating rectangle:");
        Rectangle r3 = new Rectangle(4, 6);
        System.out.println(r3);

        System.out.println("\nSquare check:");
        System.out.println("r2 is square: " + r2.isSquare());
        System.out.println("r3 is square: " + r3.isSquare());

        System.out.println("\nAfter scaling r3:");
        r3.scale(2);
        System.out.println(r3);
    }
}
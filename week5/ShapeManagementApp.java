public class ShapeManagementApp {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle("Red", 5),
            new Rectangle("Blue", 10, 5),
            new Square("Green", 4),
            new Circle("Yellow", 3),
            new Rectangle("Black", 6, 4)
        };

        double totalArea = 0;
        double totalPerimeter = 0;

        System.out.println("SHAPE DETAILS");
        System.out.println("-------------------------");

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();

            totalArea = totalArea + shape.area();
            totalPerimeter = totalPerimeter + shape.perimeter();
        }

        System.out.println("-------------------------");
        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);

        // Find shape with largest area
        Shape largest = shapes[0];

        for (Shape shape : shapes) {
            if (shape.area() > largest.area()) {
                largest = shape;
            }
        }

        System.out.println("\nShape with largest area:");
        System.out.println(largest);

        // Safe instanceof example
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                square.showSquareInfo();
            }
        }
    }
}
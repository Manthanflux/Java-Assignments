public class Rectangle {

    private double width;
    private double height;

    // No argument constructor
    public Rectangle() {
        this(1, 1);
        System.out.println("No-argument constructor called");
    }

    // Square constructor
    public Rectangle(double size) {
        this(size, size);
        System.out.println("One-argument constructor called");
    }

    // Rectangle constructor
    public Rectangle(double width, double height) {

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }

        this.width = width;
        this.height = height;

        System.out.println("Two-argument constructor called");
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public void scale(double factor) {

        if (factor <= 0) {
            throw new IllegalArgumentException("Factor must be positive");
        }

        width = width * factor;
        height = height * factor;
    }

    public String toString() {
        return "Width: " + width +
               ", Height: " + height +
               ", Area: " + getArea() +
               ", Perimeter: " + getPerimeter();
    }
}
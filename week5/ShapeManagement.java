abstract class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract double area();

    abstract double perimeter();

    public String toString() {
        return "Color: " + color;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String color, double radius) {
        super(color);

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle - " + super.toString() +
               ", Radius: " + radius +
               ", Area: " + area();
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        super(color);

        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }

        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle - " + super.toString() +
               ", Length: " + length +
               ", Width: " + width +
               ", Area: " + area();
    }
}

class Square extends Shape {
    private double side;

    Square(String color, double side) {
        super(color);

        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }

        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square - " + super.toString() +
               ", Side: " + side +
               ", Area: " + area();
    }

    public void showSquareInfo() {
        System.out.println("This is a square.");
    }
}
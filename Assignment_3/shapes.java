package Assignment_3;

class ShapeModel {
    private double a;
    private double b;
    private String shapeType;

    // Constructor overloading
    public ShapeModel(double radius) {
        this.a = radius;
        this.shapeType = "Circle";
    }

    public ShapeModel(double length, double breadth) {
        this.a = length;
        this.b = breadth;
        this.shapeType = "Rectangle";
    }

    public ShapeModel(double base, double height, String triangleTag) {
        this.a = base;
        this.b = height;
        this.shapeType = triangleTag;
    }

    // Method overloading
    public double area() {
        if (shapeType.equals("Circle")) {
            return 3.14 * a * a;
        } else if (shapeType.equals("Rectangle")) {
            return a * b;
        } else {
            return 0.5 * a * b;
        }
    }

    public double area(double radius) {
        return 3.14 * radius * radius;
    }

    public double area(double length, double breadth) {
        return length * breadth;
    }

    public double area(double base, double height, int triangleFlag) {
        return 0.5 * base * height;
    }

    public String getShapeType() {
        return shapeType;
    }
}

public class shapes {
    public static void main(String[] args) {
        System.out.println("===== CONSTRUCTOR AND METHOD OVERLOADING =====\n");

        ShapeModel circle = new ShapeModel(7);
        ShapeModel rectangle = new ShapeModel(10, 5);
        ShapeModel triangle = new ShapeModel(8, 6, "Triangle");

        System.out.println(circle.getShapeType() + " area (using constructor data): " + circle.area());
        System.out.println(rectangle.getShapeType() + " area (using constructor data): " + rectangle.area());
        System.out.println(triangle.getShapeType() + " area (using constructor data): " + triangle.area());

        System.out.println("\nUsing overloaded area() methods directly:");
        System.out.println("Circle area with radius 5: " + circle.area(5));
        System.out.println("Rectangle area with length 12 and breadth 4: " + rectangle.area(12, 4));
        System.out.println("Triangle area with base 9 and height 3: " + triangle.area(9, 3, 1));
    }
}
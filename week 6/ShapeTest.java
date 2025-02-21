
interface ShapeBehavior {
    double area();
    double perimeter();
}


class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Circle extends Shape implements ShapeBehavior {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}


class Rectangle extends Shape implements ShapeBehavior {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
      
        System.out.println("Shape: " + circle.getName());
        System.out.println("Area: " + ((ShapeBehavior)circle).area());
        System.out.println("Perimeter: " + ((ShapeBehavior)circle).perimeter());

        System.out.println("\nShape: " + rectangle.getName());
        System.out.println("Area: " + ((ShapeBehavior)rectangle).area());
        System.out.println("Perimeter: " + ((ShapeBehavior)rectangle).perimeter());

    }
}

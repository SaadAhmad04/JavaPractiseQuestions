import java.util.*;

class Circle {
    private double radius;
    private int x, y;

    public void setData(double r, int x, int y) {
        radius = r;
        this.x = x;
        this.y = y;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    public void checkPoint(int x, int y) {
        double d = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
        if (d <= radius) {
            System.out.println("(" + x + "," + y + ") lies in the circle with center (" + this.x+ "," + this.y + ")");
        }else{
            System.out.println("(" + x + "," + y + ") do not lies in the circle with center (" + this.x+ "," + this.y + ")");
        }
    }
}

class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        double r;
        while (true) {
            System.out.print("Enter radius : ");
            r = sc.nextDouble();
            if(r < 0){
                break;
            }
            System.out.print("Enter x cordinate of center : ");
            int x = sc.nextInt();
            System.out.print("Enter y cordinate of center : ");
            int y = sc.nextInt();
            System.out.print("Enter x cordinate to check : ");
            int x1 = sc.nextInt();
            System.out.print("Enter y cordinate to check : ");
            int y1 = sc.nextInt();
            c.setData(r, x, y);
            double area = c.calculateArea();
            double perimeter = c.calculatePerimeter();
            System.out.println("Area = " + area);
            System.out.println("Perimeter = " + perimeter);
            c.checkPoint(x1, y1);
        }

    }
}

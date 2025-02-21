import java.util.*;

class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) / 1.8;
        System.out.println("------------------------------------------------");
        System.out.printf("%-20s %-20s\n" , "Fahrenheit" , "Celcius");
        System.out.println("------------------------------------------------");
        System.out.printf("%-20.2f %-20.2f\n", f, c);
        System.out.println("------------------------------------------------");
        sc.close();
    }
}

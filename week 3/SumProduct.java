import java.util.*;

public class SumProduct {
    private static int n1, n2, n3, n4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getInput(sc);
        int sum = computeSum();
        System.out.println("Sum = " + sum);
        int product = computeProduct();
        System.out.println("Product = " + product);
    }

    public static void getInput(Scanner sc) {
        System.out.print("Enter first number : ");
        n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        n2 = sc.nextInt();
        System.out.print("Enter third number : ");
        n3 = sc.nextInt();
        System.out.print("Enter fourth number : ");
        n4 = sc.nextInt();
    }

    public static int computeSum() {
        return n1 + n2 + n3 + n4;
    }

    public static int computeProduct() {
        return n1 * n2 * n3 * n4;
    }
}

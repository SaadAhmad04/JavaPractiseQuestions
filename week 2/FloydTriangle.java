import java.util.*;

class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\nPress 1 to print Floyd Triangle");
            System.out.println("Press 2 to print Floyd Binary Triangle");
            System.out.println("Press -1 to exit");
            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                floydTriangle(sc);
            } else if (ch == 2) {
                binaryTriangle(sc);
            }
        } while (ch != -1);
        sc.close(); 
    }

    public static void floydTriangle(Scanner sc) {
        System.out.print("Enter the number of rows for Floyd Triangle: ");
        int r = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void binaryTriangle(Scanner sc) {
        System.out.print("Enter the number of rows for Floyd Binary Triangle: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

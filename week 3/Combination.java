import java.util.*;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number : ");
        int n = sc.nextInt();
        int cn = n, c = 0;
        while (cn > 0) {
            cn /= 10;
            c++;
        }
        if (c != 3) {
            System.out.println(n + " is not a 3 digit number");
        } else {
            printCombinations(Integer.toString(n), "");
        }
        sc.close();
    }

    public static void printCombinations(String str,  String newStr) {
        if (str.isEmpty()) {
            System.out.println(newStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String remainingString = str.substring(0, i) + str.substring(i + 1);
            printCombinations(remainingString , newStr + str.charAt(i));
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lexicographical {
    private static String str;
    private static String[] arr;

    public static void getString(Scanner sc) {
        System.out.print("Enter the sentance : ");
        str = sc.nextLine();
    }

    public static void sortLexicographically() {
        int wordCount = 0;
        int beginIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                wordCount++;
            }
        }
        arr = new String[wordCount];
        int c = 0;
    
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                if (i == str.length() - 1) {
                    arr[c] = str.substring(beginIndex, i + 1).trim();
                } else {
                    arr[c] = str.substring(beginIndex, i).trim();
                }
                c++;
                beginIndex = i + 1;
            }
        }
    
       for (int i = 0; i < arr.length - 1; i++) {
            int key = i;
            for (int j = i + 1; j < arr.length; j++) {
               
                if (arr[key].compareTo(arr[j]) > 0) {
                    key = j; 
                }
            }
    
           
            if (key != i) {
                String temp = arr[i];
                arr[i] = arr[key];
                arr[key] = temp;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "Hello";
        getString(sc);
        sortLexicographically();
    }

}

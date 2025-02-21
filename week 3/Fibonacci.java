import java.util.*;

class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Up to which term you want to print fibonacci series ? ");
        int n = sc.nextInt();
        int a = 0 , b = 1 , c;
        System.out.print(a + " " + b);
        c = a + b;
        do{
            System.out.print(" "  + c);
            a = b;
            b = c;
            c = a + b;
            n--;
        }while(n > 0);
        sc.close();
    }
}
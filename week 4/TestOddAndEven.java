import java.util.*;

class OddAndEven {
    int countOfOdd, countOfEven;

    public void addNumber(int num) {
        if (num % 2 == 0) {
            countOfEven++;
        } else {
            countOfOdd++;
        }
    }

    public String toString(){
        return "Number of Odd : " + countOfOdd + "\tNumber of even : " + countOfEven;
    }
}

class TestOddAndEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddAndEven obj = new OddAndEven();
        String n;
        
        do {
            System.out.println("Enter a number (or q to quit): ");
            n = sc.next();
    
            if (n.equalsIgnoreCase("q")) {
                break;
            }
            
            try {
                obj.addNumber(Integer.parseInt(n));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
            
        } while (true);

        String result = obj.toString();
        System.out.println(result);
    }
}
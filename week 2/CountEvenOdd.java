import java.util.*;

class CountEvenOdd{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		System.out.println("Enter numbers to count odd and even numbers.");
        	System.out.println("Enter -1 to stop.");
		while(true){
			int num = sc.nextInt();
			if(num == -1){
				System.out.println("Even numbers = " + even);
				System.out.println("Odd numbers = " + odd);
				break;
			}
			if(num % 2 == 0){
				even++;
			}
			else{
				odd++;
			}
		}
	}
			
}
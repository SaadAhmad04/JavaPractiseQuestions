import java.util.*;

class ComputeSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("2 + 4 + 6 + .............. + n");
		System.out.print("Upto which term you want to print the sum ? ");
		int n = sc.nextInt();
		int sum = 0 , num = 2;
		for(int i = 0; i < n; i++){
			sum += num;
			num += 2;
		}	
		System.out.println("Sum of first " + n + " even numbers = " + sum);
	}
}
		
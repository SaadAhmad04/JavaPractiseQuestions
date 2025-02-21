import java.util.*;

class MyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		double num = sc.nextDouble();
		double numRound = Math.round(num);
		System.out.println("Round = " + numRound);
		double numCeil = Math.ceil(num);
		System.out.println("Ceil = " + numCeil);
		double numFloor = Math.floor(num);
		System.out.println("Floor = " + numFloor);
		int numInteger = (int)(num);
		System.out.println("Integer = " + numInteger);
	}
}
import java.util.*;

class PrintAddress{
	private static String name;
	private static String address;

	public static void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		name = sc.next();
		sc.nextLine();
		System.out.print("Enter your address: ");
		address = sc.nextLine();
	}

	public static void printDetails(){
		System.out.println(name + " lives at " + address);
	}

	public static void main(String[] args){
		getDetails();
		printDetails();
	}
}

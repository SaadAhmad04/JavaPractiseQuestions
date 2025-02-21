import java.util.*;

class Operations{
	private int a;
	private int b;
	
	public void getNumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		a = sc.nextInt();
		System.out.print("Enter second number : ");
		b = sc.nextInt();
	}

	public int add(){
		int sum = a + b;
		return sum;
	}

	public int subtract(){
		int difference = a - b;
		return difference;
	}

	public int multiply(){
		int product = a * b;
		return product;
	}

	public int divide(){
		int quotient = a / b;
		return quotient;
	}

	public void check(){
		if(a > b){
			System.out.println(a + " is maximum");
			System.out.println(b + " is minimum");
		}
		else if(a < b){
			System.out.println(b + " is maximum");	
			System.out.println(a + " is minimum");
		}
		else{
			System.out.println("Both are equal");
		}
	}
		

	public static void main(String[] args){
		Operations op = new Operations();
		op.getNumbers();
		int sum = op.add();
		System.out.println("Sum = " + sum);
		int difference = op.subtract();
		System.out.println("Difference = " + difference);
		int product = op.multiply();
		System.out.println("Product = " + product);
		int quotient = op.divide();
		System.out.println("Quotient = " + quotient);
		op.check();
	}
}
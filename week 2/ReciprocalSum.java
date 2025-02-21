public class ReciprocalSum{
	public static void main(String[] args){
		double sum = 0.0;
		for(int i = 1; i <= 10; i++){
			sum += (1.0/i);
		}
		System.out.println("Sum of 1/1 + 1/2 + 1/3 + .......... + 1/10 = " + sum);
	}
}
		
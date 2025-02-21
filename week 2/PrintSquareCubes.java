class PrintSquareCubes{
	public static void main(String[] main){
		System.out.println("Squares and cubes from 1 to 5\n");
		for(int i = 1; i <= 5; i++){
			System.out.printf("Square of %-2d = %-5d Cube of %-2d = %-5d\n", i , (i*i), i, (i*i*i));
		}
	}
}
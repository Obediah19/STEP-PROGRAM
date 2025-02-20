import java.util.Scanner;

class numberNature {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = input.nextInt();
		
		if(num > 0){
			System.out.println("The number is positive");
		} else if (num < 0){
			System.out.println("The number is negative");
		} else if (num == 0){
			System.out.println("The number is zero");
		}
		
	}
}
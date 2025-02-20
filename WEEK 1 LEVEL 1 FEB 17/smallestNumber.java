import java.util.Scanner;

class smallestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		double num1 = input.nextDouble();
		System.out.println("Enter Number 2: ");
		double num2 = input.nextDouble();
		System.out.println("Enter Number 3: ");
		double num3 = input.nextDouble();
		if (num1 < num2 && num1 < num3){
			System.out.println("Num 1 is the smallest");
		} else {
			System.out.println("Num 1 is not the smallest");
		}
	}
}
import java.util.Scanner;

class largestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		double num1 = input.nextDouble();
		System.out.println("Enter Number 2: ");
		double num2 = input.nextDouble();
		System.out.println("Enter Number 3: ");
		double num3 = input.nextDouble();
		
		if (num1 > num2 && num1 > num3){
			System.out.println("Number 1: "+num1+" is the largest");
		} else if (num2 > num1 && num2 > num3){
			System.out.println("Number 2: "+num2+" is the largest");
		} else if (num3 > num1 && num3 > num2){
			System.out.println("Number 3: "+num3+" is the largest");
		} else {
			System.out.println("Could not calculate largest number");
		}
	}
}
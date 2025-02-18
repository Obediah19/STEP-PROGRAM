import java.util.Scanner;

class calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		double num1 = input.nextDouble();
		System.out.println("Enter Number 2: ");
		double num2 = input.nextDouble();
		double add = num1 + num2;
		double subtract = num1 - num2;
		double multiply = num1*num2;
		double divide = num1/num2;
		
		System.out.println("Addition: "+add+"\nSubtraction: "+subtract+"\nMultiplication: "+multiply+"\nDivision: "+divide);
	}
}
		
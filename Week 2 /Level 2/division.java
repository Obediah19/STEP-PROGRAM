import java.util.Scanner;

class divison{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Number 1: ");
	double num1 = input.nextDouble();
	System.out.println("Enter Number 2: ");
	double num2 = input.nextDouble();
	
	double quotient = num1/num2;
	double remainder = num1 % num2;
	
System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two numbers "+num1+" and "+num2);
}
}
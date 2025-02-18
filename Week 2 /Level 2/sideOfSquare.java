import java.util.Scanner;

class sideOfSquare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Perimeter: ");
		double perimeter = input.nextDouble();
		double side = perimeter/4.0;
		
		System.out.println("The length of side is "+side+" whose perimeter is "+perimeter);
	}
}
import java.util.Scanner;

class athleteRunning{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side 1 in meters: ");
		double side1 = input.nextDouble();
		System.out.println("Enter side 2 in meters: ");
		double side2 = input.nextDouble();
		System.out.println("Enter side 3 in meters: ");
		double side3 = input.nextDouble();
		double perimeter = side1 + side2 + side3;
		double numberOfRounds = perimeter / 5000.0;
		numberOfRounds = 5000.0/perimeter;
		System.out.println("The total number of rounds the athlete will run is "+numberOfRounds+" to complete 5km");
	}
}	
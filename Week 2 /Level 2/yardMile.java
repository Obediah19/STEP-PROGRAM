import java.util.Scanner;

class yardMile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in feet: ");
		double distanceFeet = input.nextDouble();
		double distanceYard = distanceFeet/3.0;
		double distanceMile = distanceYard/1760;
		
		System.out.println("The distance in feet is "+distanceFeet+" in yard is "+distanceYard+" in miles is "+distanceMile);
	}
}

import java.util.Scanner;

class poundToKg{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weightPound = input.nextDouble();
		double weightKG = weightPound/2.2;
		
		System.out.println("The weight of a person in pound is "+weightPound+" and in kg is "+weightKG);
	}
}
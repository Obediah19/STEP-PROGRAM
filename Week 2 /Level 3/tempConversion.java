import java.util.Scanner;

class tempConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Temperature in celsius");
		double celsius = input.nextDouble();
		double fahrenheitResult = (celsius*(9.0/5)) + 32;
		System.out.println("The "+celsius+" celsius is "+fahrenheitResult+" fahrenheit");
	}
}

	
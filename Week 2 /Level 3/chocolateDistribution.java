import java.util.Scanner;

class chocolateDistribution{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numberOfChildren = input.nextInt();
		System.out.println("Enter number of chocolates: ");
		int numberOfChocolates = input.nextInt();
		int division = numberOfChocolates/numberOfChildren;
		int remainder = numberOfChocolates%numberOfChildren;
		
		System.out.println("The number of chocolates each child gets is "+division+" and the number of remaining chocolates are "+remainder);
	}
}
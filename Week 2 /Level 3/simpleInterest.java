import java.util.Scanner;

class simpleInterest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		double principal = input.nextDouble();
		System.out.println("Enter Rate: ");
		double rate = input.nextDouble();
		System.out.println("Enter Time: ");
		double time = input.nextDouble();
		
		double simpleInterest = (principal*rate*time)/100.0;
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+" for Rate of Interest "+rate+" and Time "+time);
	}
}
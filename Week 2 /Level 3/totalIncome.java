import java.util.Scanner;

class totalIncome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Salary Amount: ");
		double salary = input.nextDouble();
		System.out.println("Enter Bonus Amount: ");
		double bonus = input.nextDouble();
		double totalIncome = salary + bonus;
		System.out.println("The Salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is "+totalIncome);
	}
}
import java.util.Scanner;

class discountedFee{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fee amount: ");
		int fee = input.nextInt();
		System.out.println("Enter Discount Percentage: ");
		double discountPercent = input.nextDouble();
		double discount = (discountPercent/100)*fee;
		double discountedFee = fee - discount;
		System.out.println("The discount amount is "+discount+" and final discounted fee is INR "+discountedFee);
	}
} 
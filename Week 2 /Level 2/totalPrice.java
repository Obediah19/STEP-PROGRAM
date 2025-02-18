import java.util.Scanner;

class totalPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number of items: ");
		int quantity = input.nextInt();
		System.out.println("Enter Price of 1 item: ");
		double price = input.nextDouble();
		double totalPrice = quantity * price;
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity is "+quantity+" and unit price is INR "+price);
	}
}
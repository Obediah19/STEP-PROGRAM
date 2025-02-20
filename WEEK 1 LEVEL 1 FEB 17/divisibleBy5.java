import java.util.Scanner;

class divisibleBy5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		if (number % 5 == 0){
			System.out.println("Is the number "+number+" divisble by 5? Yes");
		} else {
			System.out.println("Is the number "+number+" divisble by 5? No");
		}
	}
}
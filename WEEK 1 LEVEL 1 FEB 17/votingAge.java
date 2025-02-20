import java.util.Scanner;

class votingAge{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = input.nextInt();
		if (age >= 18){
			System.out.println("You are old enough to vote");
		} else {
			System.out.println("You are not old enough to vote");
		}
	}
}
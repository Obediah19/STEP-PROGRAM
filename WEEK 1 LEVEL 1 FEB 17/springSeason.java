import java.util.Scanner;

class SpringSeason{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer for Month: ");
		int month = input.nextInt();
		System.out.println("Enter Integer for Date: ");
		int date = input.nextInt();
		
		if (month > 2 && month < 7 && date > 19 && date < 32){
			System.out.println("Its a spring season");
		} else {
			System.out.println("Its not a spring season");
		}
	}
}
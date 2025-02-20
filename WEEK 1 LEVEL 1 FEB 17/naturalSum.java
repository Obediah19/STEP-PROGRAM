import java.util.Scanner;

class naturalSum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Natural Number: ");
		int n = input.nextInt();
		if(n > 0){
			int sum = n*(n+1)/2;
			System.out.println("The number is a natural number and the sum is: "+sum);
		} else {
			System.out.println("The number is not a natural number");
		}
	}
}
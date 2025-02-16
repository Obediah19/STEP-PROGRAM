import java.util.Scanner;

class feetInches{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Height in cm: ");
		double cm = input.nextDouble();
		double inch = cm/2.54;
		double feet = inch/12;
		System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inch);
	}
}
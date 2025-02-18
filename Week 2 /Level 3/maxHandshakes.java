import java.util.Scanner;

class maxHandshakes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int numberOfStudent = input.nextInt();
		int maxHandshakes = (numberOfStudent*(numberOfStudent-1))/2;
		System.out.println("The number of maximum handshakes is "+maxHandshakes+" for "+numberOfStudent+" students");
	}
}
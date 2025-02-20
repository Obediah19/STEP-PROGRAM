import java.util.Scanner;

class rocketLaunch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = input.nextInt();
		
		while(num >0 || num == 1) {
			System.out.println(num+"\n");
			num = num - 1;
		}
	}
}
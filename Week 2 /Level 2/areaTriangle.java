import java.util.Scanner;

class areaTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Base in cm: ");
		int baseCm = input.nextInt();
		System.out.println("Enter Height in cm: ");
		int heightCm = input.nextInt();
		double baseIn = baseCm/2.54;
		double heightIn = heightCm/2.54;
		double areaCm = 1.0/2*(baseCm*heightCm);
		double areaIn = 1.0/2*(baseIn*heightIn);
		
		System.out.println("Area of Triangle in square cm is "+areaCm+" and in square inches is "+areaIn);
	}
}

		
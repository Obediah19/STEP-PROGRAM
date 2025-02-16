import java.util.Scanner;

class kmToMile {
public static void main(String[] args){
	double km;
	Scanner input = new Scanner(System.in);
	km = input.nextDouble();
	double mile = km/1.6;
	System.out.println("The total miles is "+mile+" for the given "+km+" km");
}
}
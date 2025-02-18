import java.util.Scanner;

class DoubleOpt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		double a = input.nextDouble();
		System.out.println("Enter value of b: ");
		double b = input.nextDouble();
		System.out.println("Enter value of c: ");
		double c = input.nextDouble();
		double fun1 = a+b*c;
		double fun2 = a*b+c;
		double fun3 = c+a/b;
		double fun4 = a%b+c;
		
		System.out.println("The results of Int Operations are "+fun1+ " , "+fun2+" , "+fun3+" and "+fun4);
	}
}
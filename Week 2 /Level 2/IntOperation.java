import java.util.Scanner;

class IntOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = input.nextInt();
		System.out.println("Enter value of b: ");
		int b = input.nextInt();
		System.out.println("Enter value of c: ");
		int c = input.nextInt();
		int fun1 = a+b*c;
		int fun2 = a*b+c;
		int fun3 = c+a/b;
		int fun4 = a%b+c;
		
		System.out.println("The results of Int Operations are "+fun1+ " , "+fun2+" , "+fun3+" and "+fun4);
	}
}
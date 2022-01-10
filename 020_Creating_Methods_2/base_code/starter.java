import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b)
	{
	int e = 1;
	int x = a;
	while (e<b)
	{
	x = x*a;
		e++;
	
	}

	System.out.println(x);
		return (a);
	
	}
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc = new Scanner (System.in);
	System.out.println("what is your base number?");
	int c = sc.nextInt();
	System.out.println("what is your exponent number?");
	int d = sc.nextInt();
	pow(c,d);
		
		
	}
}

import java.util.Scanner;
class starter {
	
	public static int cow (int a, int b)
	{
		int e = a * b;
		if (e%3 == 0)
		{
			System.out.println("it is divisible by 3");
		}
		
		if (e%3 !=0)
		{
			System.out.println("it is not divisible by 3");
		}
		return (e);
	}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("enter an integer:");
		int c = sc.nextInt();
		System.out.println("enter another integer:");
		int d = sc.nextInt();
		System.out.println("The product is " + c*d);
		cow(c,d);
	}
}

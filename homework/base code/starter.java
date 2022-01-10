import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number");
		int a = sc.nextInt();
		System.out.println("Please enter another number");
		int b = sc.nextInt();
		int i = 0;
		
		
		if (a%2 == 0)
		{
			System.out.println("Your number is even");
		}
		if (b%2 == 0)
		{
			System.out.println("Your number is even");
		}
		System.out.println();
		if (a%2 == 1)
		{
			 System.out.println("Your number is odd");
		}
		if (b%2 == 1)
		{
			System.out.println("Your number is odd");
		}
		System.out.println();
		
		if (a%3 == 0)
		{
			System.out.println("Your number is divisible by 3");
		}
		if (b%3 == 0)
		{
			System.out.println("Your number is divisible by 3");
		}
		System.out.println();
		if (a%4 == 0)
		{
			System.out.println("Your number is divisible by 4");
		}
		if (b%4 == 0)
		{
			System.out.println("Your number is divisible by 4");
		}
		System.out.println();
		if (a%5 == 0)
		{
			System.out.println("Your number is divisible by 5");
		}
		if (b%5 == 0)
		{
			System.out.println("Your number is divisible by 5");
		}
		
		
		
	}
}

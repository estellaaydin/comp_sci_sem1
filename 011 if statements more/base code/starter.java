import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input a number!");
		int number = sc.nextInt();
		System.out.println("Please input another number!");
		int number1 = sc.nextInt();
		if (number != number1 || number == number1)
		{
			System.out.println("el oh el");
		}
	}
}

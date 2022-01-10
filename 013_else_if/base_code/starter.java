import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Pick a number from 1-1000");
		int mary = sc.nextInt();
		Random rand = new Random();
		int washington = rand.nextInt(1000);
		System.out.println(washington);
		if (mary== washington)
		{
			System.out.println("Your number was correct!");
		}
		else if (mary<washington)
		{
			System.out.println("Your number was smaller than the random number.");
		}
		else if (mary>washington)
		{
			System.out.println("Your number was larger than the random number.");
		}
		
	}
}

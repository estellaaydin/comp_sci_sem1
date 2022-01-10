import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		String mary = sc.nextLine();
		if (mary.equals("Wizard"))
		{
			System.out.println("Yer a Wizard Harry!");
		}
		else if (mary.equals("Warrior")) 
		{
			System.out.println("You're a Warrior. go fight");
		}
		else if (mary.equals("Rogue"))
		{
			System.out.println("You're a Rogue. congrats. the fbi is on their way.");
		}
		else 
		{
			System.out.println("just pick one of the options. also you may have spelled it wrong.");
		}
	}
}

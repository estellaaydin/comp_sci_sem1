import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title?");
		String title = sc. nextLine();
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
		System.out.println();
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. go crazy.");
		System.out.println();
		//STRENGTH
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		int leftover= 25-strength;
		System.out.println("You have " + leftover + " points left!");
		
		//DEXTERITY
		System.out.println();
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		int leftover1 = leftover-dexterity;
		System.out.println("You have " + leftover1 + " points left!");
		
		//INTELLIGENCE
		System.out.println();
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		int leftover2 = leftover1-intelligence;
		System.out.println("You have " + leftover2 + " points left!");
		
		//CONSTITUTION
		System.out.println();
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		int leftover3 = leftover2-constitution;
		System.out.println("You have " + leftover3 + " points left!");
		
		//CHARISMA
		System.out.println();
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		int leftover4 = leftover3-charisma;
		System.out.println("You have " + leftover4 + " points left!");
		
		//LAST PART
		System.out.println("-------------------------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of the coolest kingdom alive.");
		System.out.println("You're a " + mary + " with the following stats.");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Constitution - " + constitution);
		System.out.println("Charisma - " + charisma);
		System.out.println();
		System.out.println("Try not to die " + name + "!");
	}
	
}

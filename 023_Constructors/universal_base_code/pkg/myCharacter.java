package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public String a;

	public myCharacter() {
		role = new String("no role");
		
		
	}
	public myCharacter(String a)
	{
		role(a);
	}
	public String role(String a)
	{
		role = a;
		if (a.equals("Wizard") || a.equals ("wizard"))
		{
			System.out.println("Yer a Wizard Harry!");
		}
		else if (a.equals("Warrior") || a.equals ("warrior")) 
		{
			System.out.println("You're a Warrior. go fight");
		}
		else if (a.equals("Rogue") || a.equals ("rogue"))
		{
			System.out.println("You're a Rogue. congrats. the fbi is on their way.");
		}
		else 
		{
			System.out.println("No Role.");
		}
		return role;
	}
}



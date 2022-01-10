import java.util.Scanner;
import java.util.Random;

class Character{
	String a = new String ("You're a Wizard");
	int z = 5;
	int y = 5;
	int x = 5;
	int w = 5;
	int v = 5;
	String b = new String ("Your strngth trait is " + z + "!");
	String c = new String ("Your dexterity trait is " + y + "!");
	String d = new String ("Your intelligence trait is " + x + "!");
	String e = new String ("Your constitution trait is " + w + "!");
	String f = new String ("Your charisma trait is " + v + "!");
	

}



class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Character myCharacter = new Character();
	System.out.println(myCharacter.b);
	System.out.println(myCharacter.c);
	System.out.println(myCharacter.d);
	System.out.println(myCharacter.e);
	System.out.println(myCharacter.f);

		
	}
}

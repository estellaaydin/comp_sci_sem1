import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter test = new myCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("what class would you like to be in");
		String person = sc.nextLine();
		if (person.equals ("rogue")){
			System.out.println("you chose rogue");
		}
		if (person.equals ("wizard")){
			System.out.println("you chose wizard");
		}
		if (person.equals ("warrior")){
			System.out.println("you chose warrior");
		}
		test.myToString();


		
	}
}

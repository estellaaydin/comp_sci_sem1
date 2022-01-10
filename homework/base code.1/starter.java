import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			
		
		//RULES
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		
		int z = 100;
	

		Random rand = new Random();
			Scanner sc = new Scanner (System.in);
		
		while (true){
		int c = rand.nextInt(10) + 1;
		int d = rand.nextInt(10) + 1;
		int e = rand.nextInt(10) + 1;
		System.out.print("Would you like to play a slot machine game? (Yes,yes,Y,y): ");
		String a = sc.nextLine();
	
		if (a.equals ("Yes")|| a.equals ("yes") || a.equals ("Y") || a.equals ("y"))
		{
			System.out.print("You have $" +z + " How much would you like to wager?: ");
			int bb = sc.nextInt();
			sc.nextLine();
			
		// System.out.println();
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are: ");
		
		System.out.println("_______________________");
		System.out.println(" | " + c + " | " + d + " | " + e + " | ");
		if (c==d || c==e || d==e)
		{
			System.out.println("You won! Your wager has been doubled!");
			z= z*2;
			System.out.println("You now have $" + z);
		}
		else if (c==d && c==e)
		{
			System.out.println("You won! Your wager has been tripled!");
			z= z*3;
			System.out.println("You now have $" + z);
		}
		else if (c!=d && c!=e && d!=e)
		{
			z = z-bb ;
			System.out.println("Didn't win this time, better luck next time!You now have $" + z);
		}
		if (z==0){
			System.out.println("You ran out of money :(");
			break;
		}
		
		}
		
	
		 else{
		 	System.out.println("that sucks. you have $" + z);
		 	break;
		 }
	
	
		 //int bb= sc.nextInt();
	
		
		}
	}
}

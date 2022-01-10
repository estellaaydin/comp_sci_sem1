import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input a number!");
		int washington = sc.nextInt();
		System.out.println("Please input another number!");
		int mary = sc.nextInt();
		System.out.println("Please input another number!");
		int gary = sc.nextInt();
		if ((washington> mary) && (washington > gary))
		{ 
			System.out.println(washington + " is the largest number!");
		}
		if ((mary > washington) && (mary > gary))
		{
			System.out.println(mary + " is the largest number!");
		}
		if ((gary > washington) && (gary > mary))
		{
			System.out.println(gary + " is the largest number!");
		}
		if ((washington < mary) && (washington < gary))
		{
			System.out.println (washington + " is the smallest number!");
		}
		if ((mary < washington) && (mary < gary))
		{
			System.out.println(mary + " is the smallest number!");
		}
		if ((gary < washington) && (gary < mary))
		{
			System.out.println(gary + " is the smallest number!");
		}
		
	}
}

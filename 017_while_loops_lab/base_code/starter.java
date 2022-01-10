import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String name= sc.nextLine();
		System.out.println("How many times would you like your name to be printed?");
		int number = sc.nextInt();
		int a = 1;
		while (true)
		{
			System.out.println(name);
			if (a==number)
			{
				break;
			}
			a = a+1;
		}


		
	}
}

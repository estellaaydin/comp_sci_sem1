import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a random number from 1-1ooo");
		int guess = sc.nextInt();
		Random rand = new Random();
		int secretnum = rand.nextInt(1000);
		int a = 0;
		
		while (true)
		{
		
		if (guess < secretnum)
		{
			System.out.println("Your number is too low");
			System.out.println("try again");
			guess = sc.nextInt();
		}
		else if (guess > secretnum)
		{
			System.out.println("Your number is too high");
			System.out.println("try again");
			guess = sc.nextInt();
		}
		else if (guess == secretnum)
		{
			System.out.println("you win, but im still better");
			break;
		}
		a=a+1; //or a++
	
		}
		
		
		


		
	}
}

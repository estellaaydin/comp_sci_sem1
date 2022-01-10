import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your first name?");
		String text = sc.nextLine();
		System.out.println("What is your age?");
		int number = sc.nextInt();
		System.out.println("What is your birthday month? (1-12)");
		int number1 = sc.nextInt();
		System.out.println("What is your birthday day?(1-31)");
		int number2 = sc.nextInt();
		System.out.println("What is your birthday year?");
		int number3 = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double number4 = sc.nextDouble();
		System.out.println("Your name is "+text+" and you were born on "+number1+"/"+number2+"/"+number3+".");
		System.out.println("You are "+number+ " years old!!");
		System.out.println("You have $"+number4+" in your wallet.");
	}
}

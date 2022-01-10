import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_num1 = rand.nextInt(9);
		System.out.println(rand_num1);
		int rand_num2 = rand.nextInt(100)+1;
		System.out.println(rand_num2);
		double rand_num3 = rand.nextDouble();
		double rand_num4 = rand_num3+2.5;
		System.out.println(rand_num4);
		double rand_num7 = rand.nextDouble()*575+14.0;
		System.out.println(rand_num7);
	}
}

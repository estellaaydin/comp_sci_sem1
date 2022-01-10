import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println("what's your full name? (with a space between your first and last");
		String a = sc.nextLine();
		int b = a.indexOf(" ");
		//System.out.print(b);
		System.out.println(a.substring (b) );
	}
}

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter any word");
		String b = sc.nextLine();
		int counter;
		int a = b.length();
		for (counter=0; counter< a; counter++){
			System.out.println(b.substring(counter, counter+1));
			System.out.println();
		}

		
	}
}

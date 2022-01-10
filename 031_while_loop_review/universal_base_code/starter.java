import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random ();
		int counter = 0;
		while (true) {
			int a = rand.nextInt(100);
			System.out.println(a);
			
			
			if (counter == 100){
				break;
			}
			counter = counter + 1;
		}


		
	}
}

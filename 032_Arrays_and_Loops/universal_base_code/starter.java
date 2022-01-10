import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		
		int [] y = new int [1000];
		int counter = 0;
		
		while (counter < 1000){
			int a  = rand.nextInt(1000);
			y[counter] = a;
			if (counter == 999){
				break;
			}
			counter = counter +1;
		}
		counter = 0;
		while(counter < y.length){
			System.out.println(y[counter]);
			counter = counter + 1;
		} 
		

		
	}
}

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int randarray = rand.nextInt(149) + 51;
		int [] y = new int [randarray];
		int min = 100;
		int max = 1;
		int counter = 0;
		while (counter<y.length){
			int a = rand.nextInt(100)+1;
			y[counter] = a;
			// System.out.println(y[counter] + "");
			counter = counter +1;
		}
		
		counter = 0;
		System.out.println();
		while(counter < y.length){
			if (y[counter] < min){
				min = y[counter];
			}
			counter = counter + 1;
		}
		System.out.println("there are " + randarray + " elements and the minimum is " + min);
		// System.out.println();
		
		counter = 0;
		while(counter < y.length){
			if (y[counter] > max){
				max = y[counter];
			}
			counter = counter + 1;	
		}
		System.out.println("there are " + randarray + " elements and the maximum is " + max);
		//System.out.println();
		counter = 0;
		int p = 0;
		
		while(counter < y.length){
			p = p + y[counter];
			//System.out.println("sum: " + p);
			counter = counter + 1;
			
		}
		int sum = p;
		
		//System.out.println();
		int avg = sum/randarray;
		System.out.println("there are " + randarray + " elements and the average is " + avg);
		//System.out.println(randarray);
	}
}


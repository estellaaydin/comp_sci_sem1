import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();
	Random rand = new Random();
	int [] y = new int [20];
	System.out.println("the random numbers are:");
	int b;
	for(b = 0; b < y.length; b ++){
		int a = rand.nextInt(10)+1;
		y[b] = a;
		System.out.print(y[b] + " ");
		
	}
		System.out.println();
		b = 0;
		int c = rand.nextInt(10) + 1;
		System.out.println("target number:  " + c);
		int counter = 0;
		for(b = 0; b<y.length; b++){
			
			if (y[b] == c){
			
			System.out.println("y[" + b + "]");
			counter++;
			}
		}
		System.out.println("There is a total of " + counter + " duplicates");
		
		b = 0;
		
		for(b=0; b<y.length-1; b++){
			if(y[b+1] == y[b]){
				System.out.print("y[" + b + "] = ");
				System.out.println(y[b] + " is a consecutive number");
			}
			
		}
		
	}
}

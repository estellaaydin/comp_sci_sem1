import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray( int [] a ){
		int counter;
		for( counter = 0; counter < a.length; counter++){
			System.out.print(a[counter] + " ");
		}
		return;
		}
		
		
		
	public static int getArrayAverage( int [] x ){
		int counter = 0;
		int sum = 0;
		for (counter = 0; counter < x.length; counter++){
			sum = sum + x[counter];
		}
	
		int avg = sum / x.length;
		
		System.out.println();
		System.out.println("the avg of 100 random numbers is  "+avg);
		return avg;
		
	}
	
	public static int getArrayMax( int [] f ) {
		int max = 1;
		int counter;
		for (counter = 0; counter < f.length; counter++){
			if(f[counter] > max){
				max = f[counter];
			}
			counter = counter +1;
		}
		
		System.out.println("the max of 100 random numbers is " + max);
		return max;
	}
	public static int getArrayMin( int [] g ) {
		int min = 100;
		int counter;
		for (counter = 0; counter < g.length; counter++){
			if(g[counter] < min){
				min = g[counter];
			}
			counter++;
		}
		System.out.println("the min of 100 random numbers is " + min);
		return min;
	}
	
	
	
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	
	int [] y = new int [100];
	
	
	int counter = 0;
	while (counter < y.length){
	int aa= rand.nextInt(101);
	y[counter] = aa;

	counter = counter +1;
	}	
	
	
	toStringArray(y);
	getArrayAverage(y);
	getArrayMax(y);
	getArrayMin(y);

		
	}
}

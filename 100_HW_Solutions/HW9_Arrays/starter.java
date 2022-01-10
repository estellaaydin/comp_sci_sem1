import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();

		Random rand = new Random();
	
		int [] y = new int [20];
		int counter = 0;
		
		while (counter<y.length){
			int a = rand.nextInt(50) + 1;
			y[counter] = a;
			System.out.print (y[counter]+" ");
			counter = counter + 1;
		}
		System.out.println();
		int [] x = new int [20];
		x[0] = y[19];
		x[1] = y[18];
		x[2] = y[17];
		x[3] = y[16];
		x[4] = y[15];
		x[5] = y[14];
		x[6] = y[13];
		x[7] = y[12];
		x[8] = y[11];
		x[9] = y[10];
		x[10] = y[9];
		x[11] = y[8];
		x[12] = y[7];
		x[13] = y[6];
		x[14] = y[5];
		x[15] = y[4];
		x[16] = y[3];
		x[17] = y[2];
		x[18] = y[1];
		x[19] = y[0];
		System.out.print( x[0] +" ");
		System.out.print( x[1] +" ");
		System.out.print( x[2] +" ");
		System.out.print( x[3] +" ");
		System.out.print( x[4] +" ");
		System.out.print( x[5] +" ");
		System.out.print( x[6] +" ");
		System.out.print( x[7] +" ");
		System.out.print( x[8] +" ");
		System.out.print( x[9] +" ");
		System.out.print( x[10] +" ");
		System.out.print( x[11] +" ");
		System.out.print( x[12] +" ");
		System.out.print( x[13] +" ");
		System.out.print( x[14] +" ");
		System.out.print( x[15] +" ");
		System.out.print( x[16] +" ");
		System.out.print( x[17] +" ");
		System.out.print( x[18] +" ");
		System.out.print( x[19] +" ");	
	}
}

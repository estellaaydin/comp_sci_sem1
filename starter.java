import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String c)
	{
		
	System.out.println(c);
	return;
		
		
	}
	public static void toStringCombined (String c, String d)
	{
	System.out.println(c+" "+d);
	
		return;
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println("write a sentence");
		String c = sc.nextLine();
		System.out.println("Write a sentence");
		String d = sc.nextLine();
		System.out.println();
		
		toString(c);
		toStringCombined(c,d);
		
		
	}
}

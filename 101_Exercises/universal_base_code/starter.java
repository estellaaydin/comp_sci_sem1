import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii a = new Ascii("human");
		//a.setType();
		//a.setName();
		//a.setNumber();
		a.printArt();
		
		System.out.println();
		
		Ascii b = new Ascii("dog");
		b.printArt();
		
		System.out.println();
		
		Ascii c = new Ascii ("cactus");
		c.printArt();
		
		System.out.println();
		
		Ascii d = new Ascii ("Other");
		d.setAscii("...");
		d.setName("murphy");
		d.setType("other");
		d.setNumber(1);
		d.printArt();
		
		System.out.println();
		
		Ascii e = new Ascii ("camera");
		e.printArt();
		
		
	}
}

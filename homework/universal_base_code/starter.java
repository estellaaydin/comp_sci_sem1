import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog a = new Dog("camel");
		a.setAge(5);
		System.out.println("this is " + a.getName() + " and he is  " + a.getAge() + ".");
		Dog b = new Dog("sally", "poodle");
		System.out.println("this is " + b.getName() + " and she is a " + b.getBreed() + ".");
		
		boolean fbi= a.isSleeping();
		boolean bif = b.isSleeping();
		
		if (fbi == true)
		{
			System.out.println(a.getName() + " is asleep");
		}
		else if (fbi == false)
		{
			a.bark();
		}
		if (bif == true && fbi == false)
		{
			System.out.print(b.getName() + " was asleep but wakes up and ");
			b.bark();
		}
		else if (bif == false && fbi == false)
		{
			System.out.print(b.getName() + " is awake and ");
			b.bark();
		}
	}
		
}

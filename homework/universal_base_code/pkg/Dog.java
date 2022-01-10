package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public String name;
	public String breed;
	public int age;
		
		public Dog(){
			name = ("Clifford");
			age = 3;
			breed = ("big red dog");
		}
		public Dog(String a){
			name = a;
			age= 1;
			breed = "dog dog";
		}
		public Dog (String c, String d){
			name = c;
			breed = d;
			age = 1;
		}
		public Dog (String e, int f){
			name = e;
			age = f;
			breed = "dog dog";
		}
		
		public void setName(String g){
			name = g;
			return;
		}
		public void setAge(int h){
			age = h;
			return;
		}
		public void setBreed(String i){
			breed = i;
			return;
		}
		public String getName(){
			return name;
		}
		public int getAge(){
			return age;
		}
		public String getBreed(){
			return breed;
		}
		public static boolean isSleeping(){
			Random rand = new Random();
			int rnum = rand.nextInt(2);
			if (rnum == 0){
				return true;
			}
			else{
				return false;
			}	
		}
		public void bark(){
			System.out.println(name + " barks.");
			return;
		}
		

}


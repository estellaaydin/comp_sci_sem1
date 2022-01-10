package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;

	public myCharacter() {
		
		
	}

	public String setRole(String a){
		if (a.equals ("rogue") || a.equals ("Rogue")){
			System.out.println("you chose rogue");
		}
		if (a.equals ("wizard") || a.equals ("Wizard")){
			System.out.println("you chose wizard");
		}
		if (a.equals ("warrior") || a.equals ("Warrior")){
			System.out.println("you chose warrior");
		}
	}
	
	public int setStrength(int b){
		strength= b;
		return b;
	}
	public int setDexterity(int c){
		dexterity= c;
		return c;
	}
	public int setIntelligence(int d){
		intelligence= d;
		return d;
	}
	public int setConstitution(int e){
		constitution= e;
		return e;
	}
	public int setCharisma(int f){
		charisma= f;
		return f;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
		role= a;
		stregnth= b;
		dexterity= c;
		intelligence= d;
		constitution= e;
		charisma= f;
		return true;
	}
}


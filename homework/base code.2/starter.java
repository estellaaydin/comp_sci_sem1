import java.util.Scanner;
class starter {
	
	public static boolean checkPrime(int a){
	int b = a-1;
	while (true){
	
		if (b<=1 )
		{
			return true;
		}
		
		
		if (a%b == 0)
		{
			return false;
			
		}
		b=b-1;
	}
		
	}
	
	public static void printPrimes(int c){
		int counter = c-1;
		while (true)
		{
			if (checkPrime(counter)){
				System.out.println(counter);
			
			}
			if (counter==1){
				break;
			}
			counter=counter-1;
		}
	}
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("input an integer:");
		int f = sc.nextInt();
		 printPrimes(f);
//	System.out.println(checkPrime(2));
	}
}

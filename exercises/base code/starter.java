import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		/*System.out.println(" * * * * * * *");
		
		System.out.println("   * * * * *");
		System.out.println("     * * * ");
		System.out.println("       *");*/
		
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input a number");
		int a = sc.nextInt();
		int b = 1;
		while (true){
			System.out.println(a+1);
			if (a==5)
			{
				break;
			}
			a=a+1;
	}
}

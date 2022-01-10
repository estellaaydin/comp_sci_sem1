import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input a number");
		int a = sc.nextInt();
		// int i = a;
		int b = a + 4;
		while (true){
			System.out.println(a);
			if (a==b)
			{
				break;
			}
			a=a+1;
		} 
	}
}

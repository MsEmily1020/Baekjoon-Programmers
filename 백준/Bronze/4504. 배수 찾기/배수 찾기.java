import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		while(true) {
			int num = sc.nextInt();
			if(num == 0) break;

			if(num % N == 0) System.out.println(num + " is a multiple of " + N + ".");
			else System.out.println(num + " is NOT a multiple of " + N + ".");
		}
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			if(n % 2 == 0) System.out.println(n + " is even");
			else System.out.println(n + " is odd");
		}
	}
}

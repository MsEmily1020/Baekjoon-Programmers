import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(), n2 = sc.nextInt();
			System.out.println(n + " " + n2);
			if(n >= 2) System.out.println(n * n2 - ((n - 1) * 2));
			else System.out.println(n * n2);
		}
	}
}

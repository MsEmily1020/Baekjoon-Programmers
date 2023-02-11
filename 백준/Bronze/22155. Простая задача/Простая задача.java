import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((a <= 2 && b <= 1) || (a <= 1 && b <= 2) ? "Yes" : "No");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			for (int j = 0; j < N; j++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				System.out.println((A + B) + " " + (A * B));
			}
		}
	}
}
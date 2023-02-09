import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N * 5 - N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N * 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
	}
}
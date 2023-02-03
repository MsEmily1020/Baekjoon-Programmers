import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int N = sc.nextInt();

			if(N == 1) {
				System.out.println("#");
				System.out.println();
				continue;
			}
			
			for (int j = 0; j < N; j++) {
				System.out.print("#");
			}

			System.out.println();
			for (int j = 0; j < N - 2; j++) {
				System.out.print("#");
				for (int k = 0; k < N - 2; k++) {
					System.out.print("J");
				}
				System.out.println("#");
			}

			for (int j = 0; j < N; j++) {
				System.out.print("#");
			}
			
			if(i < t - 1) {
				System.out.println();
				System.out.println();
			}
		}
	}
}

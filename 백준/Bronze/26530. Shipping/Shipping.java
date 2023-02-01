import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			double sum = 0;
			for (int j = 0; j < n; j++) {
				sc.next();
				sum += sc.nextDouble() * sc.nextDouble();
			}
			System.out.printf("$%.2f\n", sum);
		}
	}
}
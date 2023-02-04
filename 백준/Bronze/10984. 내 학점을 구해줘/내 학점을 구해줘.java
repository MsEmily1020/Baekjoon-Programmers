import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int sum = 0; double avg = 0;
			for (int j = 0; j < n; j++) {
				int c = sc.nextInt();
				sum += c;
				avg += c * sc.nextDouble();
			}
			System.out.printf("%d %.1f\n", sum, avg / sum);
		}
	}
}

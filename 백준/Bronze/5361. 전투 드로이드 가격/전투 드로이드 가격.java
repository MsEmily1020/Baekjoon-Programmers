import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		double[] arr = { 350.34, 230.90, 190.55, 125.30, 180.90 };
		for (int i = 0; i < T; i++) {
			double sum = 0;
			for (int j = 0; j < 5; j++)
				sum += sc.nextDouble() * arr[j];
			System.out.printf("$%.2f\n", sum);
		}
	}
}

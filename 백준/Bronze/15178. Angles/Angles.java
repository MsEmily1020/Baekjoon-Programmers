import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				int n = sc.nextInt();
				sum += n;
				System.out.print(n + " ");
			}
			System.out.println(sum == 180 ? "Seems OK" : "Check");
		}
	}
}
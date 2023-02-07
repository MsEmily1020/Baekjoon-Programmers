import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int C = sc.nextInt(), K = sc.nextInt(), P = sc.nextInt();
		for (int i = 1; i <= C; i++)
			sum += K * i + P * (i * i);
		System.out.println(sum);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), sum = 0, invalid = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 0) invalid++;
			else sum += num;
		}
		N = (N % 2 == 0) ? N / 2 : N / 2 + 1;
		if (N <= invalid) System.out.println("INVALID");
		else if (sum > 0) System.out.println("APPROVED");
		else System.out.println("REJECTED");
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(), N = sc.nextInt(), M = sc.nextInt();
		System.out.println(K * N - M > 0 ? K * N - M : 0);
	}
}
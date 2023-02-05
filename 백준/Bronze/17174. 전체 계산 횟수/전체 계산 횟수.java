import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int cnt = N;
		while(N >= M) {
			N /= M;
			cnt += N;
		}
		System.out.println(cnt);
	}
}
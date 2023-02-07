import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt(), M = sc.nextInt();
			if(N == 0 && M == 0) break;
			int num = M/N;
			int sum = 0;
			for (int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(num <= a) sum += num;
				else sum += a;
			}
			System.out.println(sum);
		}
	}
}
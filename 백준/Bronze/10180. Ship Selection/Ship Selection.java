import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int cnt = 0;
			for (int j = 0; j < n; j++)
				if(sc.nextInt() * sc.nextInt() / sc.nextInt() >= d) cnt++;
			System.out.println(cnt);
		}
	}
}

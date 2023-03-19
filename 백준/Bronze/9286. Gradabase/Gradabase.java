import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int m = sc.nextInt();
			System.out.println("Case " + i + ":");
			for (int j = 0; j < m; j++) {
				int s = sc.nextInt();
				if(s == 6) continue;
				System.out.println(++s);
			}
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			boolean isMack = false, isZack = false;
			for (int j = 0; j < 10; j++) {
				int n = sc.nextInt();
				System.out.print(n + " ");
				if(n == 18) isMack = true;
				else if(n == 17) isZack = true;
			}
			System.out.println();
			System.out.println(isMack && isZack ? "both" : isMack ? "mack" : isZack ? "zack" : "none");
			System.out.println();
		}
	}
}
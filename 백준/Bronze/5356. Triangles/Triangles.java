import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			char ch = sc.next().charAt(0);
			for (int j = 0; j < N; j++) {
				for (int k = 0; k <= j; k++) {
					System.out.print(ch);
				}
				if(ch == 'Z') ch = 'A';
				else ch++;
				System.out.println();
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int cnt = 0;
		int k = sc.nextInt();
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++) {
				if(cnt++ == k) {
					System.out.println(i + " " + j);
					break;
				}
			}
	}
}
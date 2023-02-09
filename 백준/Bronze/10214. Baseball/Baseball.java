import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int sum1 = 0, sum2 = 0;
			for (int j = 0; j < 9; j++) {
				sum1 += sc.nextInt();
				sum2 += sc.nextInt();
			}
			
			System.out.println(sum1 > sum2 ? "Yonsei" : sum1 == sum2 ? "Draw" : "Korea");
		}
	}
}
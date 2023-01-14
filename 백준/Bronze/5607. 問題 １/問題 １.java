import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum1 += (a > b) ? a + b : (a == b) ? a : 0;
			sum2 += (b > a) ? b + a : (b == a) ? b : 0;
		}
		
		System.out.println(sum1 + " " + sum2);
	}
}
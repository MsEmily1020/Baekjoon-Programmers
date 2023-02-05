import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			System.out.print("Case #" + i + ": ");
			if(a * a == b * b + c * c || a * a + b * b == c * c || a * a + c * c == b * b)  System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

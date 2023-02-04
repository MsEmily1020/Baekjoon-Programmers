import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if(a == 0 && b == 0 && c == 0) break;
			System.out.println("Triangle #" + ++cnt);
			
			if(a == -1) {
				System.out.printf(c <= b ? "Impossible.\n" : "a = %.3f\n", Math.sqrt(c * c - b * b));
			}
			
			if(b == -1) {
				System.out.printf(c <= a ? "Impossible.\n" : "b = %.3f\n", Math.sqrt(c * c - a * a));
			}
			
			if(c == -1) {
				System.out.printf("c = %.3f\n", Math.sqrt(a * a + b * b));
			}
			System.out.println();
		}
	}
}

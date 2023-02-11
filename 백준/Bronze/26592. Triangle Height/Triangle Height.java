import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.printf("The height of the triangle is %.2f units\n", sc.nextDouble() / sc.nextDouble() * 2 );
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		System.out.println((k - 1) * b + (n - 1) * b);
		System.out.println((n - 1) * a);
	}
}
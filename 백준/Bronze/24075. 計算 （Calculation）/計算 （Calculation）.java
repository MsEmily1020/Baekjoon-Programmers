import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(Math.max(a + b, a - b) + "\n" + Math.min(a + b, a - b));
	}
}
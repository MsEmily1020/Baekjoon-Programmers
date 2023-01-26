import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt() * 5 - 400;
		System.out.println(p);
		System.out.println(p > 100 ? -1 : p == 100 ? 0 : 1);
	}
}
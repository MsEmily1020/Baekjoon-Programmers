import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		System.out.println((int)(Math.max(a * b / c, a / b * c)));
	}
}
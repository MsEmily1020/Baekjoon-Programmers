import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println(a - a * sc.nextDouble() / 100 >= 100 ? 0 : 1);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextDouble(); double n = sc.nextDouble();
		System.out.println((int)(Math.round((180 - n) / 2 + n / 2)));
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), x = sc.nextInt(), b = sc.nextInt(), y = sc.nextInt(), t = sc.nextInt();
		System.out.println(a + ((t > 30 ? t : 30) - 30) * x * 21);
		System.out.println(b + ((t > 45 ? t : 45) - 45) * y * 21);
	}
}
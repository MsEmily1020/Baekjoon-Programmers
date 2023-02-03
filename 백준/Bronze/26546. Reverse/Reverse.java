import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String str = sc.next();
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(str.substring(0 , a) + str.substring(b, str.length()));
		}
	}
}

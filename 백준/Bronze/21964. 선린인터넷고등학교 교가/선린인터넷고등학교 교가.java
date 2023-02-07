import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String str = sc.next();
		System.out.println(str.substring(str.length() - 5));
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt() * 100 - sc.nextInt() >= 0 ? "Yes" : "No");
	}
}

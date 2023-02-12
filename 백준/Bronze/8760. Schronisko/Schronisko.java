import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		for (int i = 0; i < z; i++) {
			System.out.println(sc.nextInt() * sc.nextInt() / 2);
		}
	}
}
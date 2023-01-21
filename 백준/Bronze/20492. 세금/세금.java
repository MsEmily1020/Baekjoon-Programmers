import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println((int)(N - (N * 0.22)));
		System.out.println((int)(N * 0.8 + ((N * 0.2) - ((N * 0.2) * 0.22))));
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt() * sc.nextInt(), P = sc.nextInt() * sc.nextInt();
		System.out.println(M > P ? "M" : M == P ? "E" : "P");
	}
}
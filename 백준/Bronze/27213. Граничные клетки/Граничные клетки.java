import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		if(m == 1 || n == 1) System.out.println(m * n);
		else System.out.println((m * n) - ((m - 2) * (n - 2)));
	}
}
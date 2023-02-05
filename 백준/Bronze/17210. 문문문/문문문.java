import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), T = sc.nextLong();
		if(N > 5) System.out.println("Love is open door");
		else {
			for (long i = 0; i < N - 1; i++) {
				System.out.println(T ^= 1);
			}
		}
	}
}
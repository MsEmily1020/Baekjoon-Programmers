import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() + 2;
		for (int i = 0; i < N; i++)
			System.out.print("@");
		
		System.out.println();
		for (int i = 0; i < N - 2; i++) {
			System.out.print("@");
			for (int j = 0; j < N - 2; j++)
				System.out.print(" ");
			System.out.println("@");
		}
		
		for (int i = 0; i < N; i++)
			System.out.print("@");
	}
}
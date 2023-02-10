import java.util.Scanner;

public class Main {
	public static void print1(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < N * 3; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < N; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public static void print2(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N * 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		print1(N); print2(N); print1(N); print2(N); print1(N);
	}
}
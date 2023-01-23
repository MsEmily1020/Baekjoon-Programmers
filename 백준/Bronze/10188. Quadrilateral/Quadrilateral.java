import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int[][] arr = new int[b][a];
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr[j].length; j2++)
					System.out.print("X");
				System.out.println();
			}
			System.out.println();
		}
	}
}
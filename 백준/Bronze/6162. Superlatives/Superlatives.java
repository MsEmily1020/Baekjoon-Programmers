import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		for (int i = 1; i <= K; i++) {
			int A = sc.nextInt(), B = sc.nextInt();
			System.out.println("Data Set " + i + ":");
			if(A <= B) System.out.print("no ");
			else {
				while(A > B * 5) {
					B *= 5;
					System.out.print("mega ");
				}
			}
			System.out.println("drought");
			System.out.println();
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
		}
	}
}

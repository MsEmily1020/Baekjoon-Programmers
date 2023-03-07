import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println((int)(n <= 1000000 ? n : n <= 5000000 ? n - n * 0.1 : n - n * 0.2));
		}
	}
}

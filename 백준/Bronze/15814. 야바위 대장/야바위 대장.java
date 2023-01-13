import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int T = sc.nextInt();
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			char ch = arr[A];
			arr[A] = arr[B];
			arr[B] = ch;
		}
		
		for (char c : arr) System.out.print(c);
	}
}
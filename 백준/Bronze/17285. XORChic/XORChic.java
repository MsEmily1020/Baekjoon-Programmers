import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String T = sc.next();
		for (int i = 0; i < T.length(); i++)
			System.out.print((char)(T.charAt(i) ^ (T.charAt(0) ^ 'C')));
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			char[] ch = sc.next().toCharArray();
			if(ch.length >= 6 && ch.length <= 9) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
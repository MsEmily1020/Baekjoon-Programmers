import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), w = sc.nextInt(), m = sc.nextInt();
		int cnt = 0;
		while(k < w) {
			k += m;
			cnt++;
		}
		System.out.println(cnt);
	}
}
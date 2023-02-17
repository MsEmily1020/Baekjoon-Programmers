import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int p1 = 0, p2 = 0;
			for (int j = 0; j < n; j++) {
				char ch1 = sc.next().charAt(0);
				char ch2 = sc.next().charAt(0);
				if((ch1 == 'P' && ch2 == 'R') || (ch1 == 'R' && ch2 == 'S') || (ch1 == 'S' && ch2 == 'P')) p1++;
				else if((ch1 == 'R' && ch2 == 'P') || (ch1 == 'S' && ch2 == 'R') || (ch1 == 'P' && ch2 == 'S')) p2++;
			}
			System.out.println(p1 > p2 ? "Player 1" : p1 == p2 ? "TIE" : "Player 2");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int w = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt();
			System.out.println("Data set: " + w + " " + l + " " + c);
			while(c-- > 0) {
				if(Math.max(w, l) == w) w /= 2;
				else l /= 2;
			}
			System.out.println(Math.max(w, l) + " " + Math.min(w, l));
			System.out.println();
		}
	}
}
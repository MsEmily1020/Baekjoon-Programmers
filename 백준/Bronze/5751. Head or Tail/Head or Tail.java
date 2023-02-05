import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			if(N == 0) break;
			int cnt1 = 0, cnt2 = 0;
			for (int i = 0; i < N; i++) {
				if(sc.nextInt() == 0) cnt1++;
				else cnt2++;
			}
			System.out.println("Mary won " + cnt1 + " times and John won " + cnt2 + " times");
		}
	}
}
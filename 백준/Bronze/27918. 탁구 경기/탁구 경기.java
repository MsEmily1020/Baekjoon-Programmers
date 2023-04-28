import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), cnt1 = 0, cnt2 = 0, check = 0;
		for (int i = 0; i < N; i++) {
			if (sc.next().equals("D")) cnt1++;
			else cnt2++;
			
			if (check == 0)
				if (Math.abs(cnt1 - cnt2) == 2) break;
		}
		
		System.out.println(cnt1 + ":" + cnt2);
	}
}

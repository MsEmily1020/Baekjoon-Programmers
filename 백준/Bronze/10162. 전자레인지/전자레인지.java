import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = { 300, 60, 10 };
		int[] cnt = new int[3];
		
		if(T % 10 != 0) System.out.println(-1);
		else {
			for (int i = 0; i < arr.length; i++) {
				if (T >= arr[i]) {
					cnt[i] = T / arr[i];
					T %= arr[i];
				}
				else continue;
			}
			
			for (int i = 0; i < cnt.length; i++) {
				System.out.print(cnt[i] + " ");
			}
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int[] arr = new int[3];
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				arr[j] = sc.nextInt();
				if(arr[j] >= 10) cnt++;
			}
			
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
			if(cnt == 0) System.out.println("zilch");
			if(cnt == 1) System.out.println("double");
			if(cnt == 2) System.out.println("double-double");
			if(cnt == 3) System.out.println("triple-double");
			System.out.println();
		}
	}
}
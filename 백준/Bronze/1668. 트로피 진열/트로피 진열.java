import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
		
		max = arr[arr.length - 1];
		cnt = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if(max < arr[i]) {
				max = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
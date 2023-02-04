import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[3];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < arr.length; j++)
				arr[j] = sc.nextInt();
			Arrays.sort(arr);
			System.out.println("Scenario #" + i + ":");
			System.out.println(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2] ? "yes\n" : "no\n");
		}
	}
}

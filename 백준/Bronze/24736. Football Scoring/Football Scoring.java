import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {6, 3, 2, 1, 2};
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 2; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++)
				sum += sc.nextInt() * arr[j];
			sb.append(sum + " ");
		}
		System.out.println(sb.toString());
	}
}
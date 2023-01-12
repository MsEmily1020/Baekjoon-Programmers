import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[sc.nextInt()];
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum1 += arr[i];
		}
		
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++)
			if(sc.nextInt() == 0) sum2 += arr[i];
		
		System.out.println(sum1 + "\n" + sum2);
	}
}

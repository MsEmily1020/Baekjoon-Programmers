import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[sc.nextInt()];
		for (int i = 0; i < N.length; i++)
			N[i] = sc.nextInt();
		
		int[] M = new int[sc .nextInt()];
		for (int i = 0; i < M.length; i++)
			M[i] = sc.nextInt();
			
		int sum = 0;
		for (int i = 0; i < N.length; i++) {
			sum += N[i];
			for (int j = 0; j < M.length; j++)
				if (sum == M[j]) sum = 0;
		}
		
		System.out.println(sum);
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[sc.nextInt()];
		for(int i = 0; i < N.length; i++)
			N[i] = sc.nextInt();
		Arrays.sort(N);
		System.out.println(N[N.length - 1]);
	}
}
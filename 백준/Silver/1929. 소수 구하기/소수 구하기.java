import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(), N = sc.nextInt();
		boolean[] arr = new boolean[N + 1];
		arr[0] = arr[1] = true;

		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			for (int j = i * i; j < arr.length; j += i) arr[j] = true;
		}
		
		for (int i = M; i <= N; i++) {
			if(!arr[i]) System.out.println(i);
		}
	}
}
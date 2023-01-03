import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] available = new int[3];
		int[] requested = new int[3];
		
		for (int i = 0; i < available.length; i++)
			available[i] = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < requested.length; i++) {
			requested[i] = sc.nextInt() - available[i];
			if(requested[i] > 0) sum += requested[i];
		}
		
		System.out.println(sum);
	}
}

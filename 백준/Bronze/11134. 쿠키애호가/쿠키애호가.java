import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int C = sc.nextInt();
			
			if(N % C == 0) System.out.println(N / C);
			else System.out.println(N / C + 1);
		}
	}
}
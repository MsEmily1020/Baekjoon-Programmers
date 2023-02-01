import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		int tmp1 = A, tmp2 = B, tmp3 = C, tmp4 = D;
		
		while(A < N) {
			A += tmp1;
			B += tmp2;
		}
		
		while(C < N) {
			C += tmp3;
			D += tmp4;
		}
		
		System.out.println(Math.min(B, D));
	}
}
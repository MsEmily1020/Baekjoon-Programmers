import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] A = sc.next().toCharArray(), B = sc.next().toCharArray();
		
		char ch = A[0];
		A[0] = A[2];
		A[2] = ch;
		
		ch = B[0];
		B[0] = B[2];
		B[2] = ch;
		
		int ans1 = Character.getNumericValue(A[0]) * 100 + Character.getNumericValue(A[1]) * 10 + Character.getNumericValue(A[2]);
		int ans2 = Character.getNumericValue(B[0]) * 100 + Character.getNumericValue(B[1]) * 10 + Character.getNumericValue(B[2]);
		
		System.out.println(Math.max(ans1, ans2));
	}
}
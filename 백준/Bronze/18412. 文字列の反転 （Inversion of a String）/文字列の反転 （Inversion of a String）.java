import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int A = sc.nextInt() - 1, B = sc.nextInt();
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str.substring(A, B)).reverse();
		System.out.println(str.substring(0, A) + sb.toString() + str.substring(B));
	}
}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			BigInteger sum = new BigInteger("0");
			for (int j = 0; j < N; j++)
				sum = sum.add(sc.nextBigInteger());
			System.out.println(sum.remainder(BigInteger.valueOf(N)) == BigInteger.ZERO ? "YES" : "NO");
		}
	}
}

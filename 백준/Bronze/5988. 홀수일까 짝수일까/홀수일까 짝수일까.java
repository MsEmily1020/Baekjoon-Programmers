import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if(sc.nextBigInteger().remainder(BigInteger.TWO) == BigInteger.ZERO) System.out.println("even");
			else System.out.println("odd");
		}
	}
}
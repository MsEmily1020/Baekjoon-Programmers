import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger total = sc.nextBigInteger();
		BigInteger diff = sc.nextBigInteger();
		BigInteger same = (total.subtract(diff)).divide(BigInteger.valueOf(2));
		System.out.println(same.add(diff) + "\n" + same);
	}
}
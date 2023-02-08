import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next(), 2);
		BigInteger b = new BigInteger(sc.next(), 2);
		System.out.println(a.add(b).toString(2));
	}
}
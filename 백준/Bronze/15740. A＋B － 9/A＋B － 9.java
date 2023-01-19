import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger in1 = sc.nextBigInteger();
		BigInteger in2 = sc.nextBigInteger();
		System.out.println(in1.add(in2));
	}
}
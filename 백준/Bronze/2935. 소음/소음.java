import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		char ch = sc.next().charAt(0);
		BigInteger B = sc.nextBigInteger();
		
		if(ch == '+') System.out.println(A.add(B));
		else System.out.println(A.multiply(B));
	}
}
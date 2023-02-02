import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			int N = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			for (int j = 0; j < N; j++) {
				BigInteger N2 = new BigInteger(br.readLine());
				sum = sum.add(N2);
			}
			System.out.println(sum.compareTo(BigInteger.ZERO) == 0 ? "0" : sum.compareTo(BigInteger.ZERO) > 0 ? "+" : "-");
		}
	}
}
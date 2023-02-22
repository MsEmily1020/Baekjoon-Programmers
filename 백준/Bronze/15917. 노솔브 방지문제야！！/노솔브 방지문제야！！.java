import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			BigInteger a = new BigInteger(br.readLine());
			if (a.and(a.multiply(new BigInteger("-1"))).equals(a)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
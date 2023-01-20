import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		long answer = 0;
		for (int i = 0; i < n.length(); i++)
			answer = (answer * 10 + n.charAt(i) - '0') % 20000303;
		System.out.println(answer);
		br.close();
	}
}
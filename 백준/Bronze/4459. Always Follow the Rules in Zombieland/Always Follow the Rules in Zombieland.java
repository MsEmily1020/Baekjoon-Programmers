import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[Integer.parseInt(br.readLine())];
		for (int i = 0; i < str.length; i++)
			str[i] = br.readLine();
		int r = Integer.parseInt(br.readLine());
		for (int i = 0; i < r; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.print("Rule " + n + ": ");
			System.out.println(n >= 1 && n <= str.length ? str[n - 1] : "No such rule");
		}
	}
}
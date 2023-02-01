import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()) * 7, P = Integer.parseInt(st.nextToken()) * 13;
		System.out.println(A > P ? "Axel" : A == P ? "lika" : "Petra");
	}
}
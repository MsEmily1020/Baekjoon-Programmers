import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] N = new int[Integer.parseInt(st.nextToken())];
		int k = Integer.parseInt(st.nextToken()) - 1;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N.length; i++)
			N[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(N);
		System.out.println(N[k]);
	}
}
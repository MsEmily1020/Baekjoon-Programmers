import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		int[] arr = { P, P, P, P };
		int min = arr[0];
		
		if(N >= 5) arr[0] = P - 500;
		if(N >= 10) arr[1] = (int)(P * 0.9);
		if(N >= 15) arr[2] = P - 2000;
		if(N >= 20) arr[3] = (int)(P * 0.75);
		
		for (int i = 0; i < arr.length; i++)
			if(min > arr[i]) min = arr[i];
		System.out.println(min < 0 ? 0 : min);
	}
}
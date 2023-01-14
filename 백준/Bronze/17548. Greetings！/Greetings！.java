import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String answer = "";
		for (int i = 0; i < str.length(); i++)
			if(str.charAt(i) == 'e') answer += "ee";
			else answer += str.charAt(i);
		bw.write(answer);
		bw.close();
		br.close();
	}
}
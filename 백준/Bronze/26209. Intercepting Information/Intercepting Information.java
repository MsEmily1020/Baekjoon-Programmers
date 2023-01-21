import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isSF = true;
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals("9")) { isSF = false; break; }
		}
		System.out.println(isSF ? "S" : "F");
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			String str = sc.next();
			for(int j = 0; j < str.length(); j++)
				if(str.charAt(j) == ',') System.out.println(str.charAt(0) - '0' + str.charAt(j + 1) - '0');
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			char ch = str.charAt(0);
			String ans = Character.toString(ch);
			for (int j = 0; j < str.length(); j++) {
				if(ch == str.charAt(j)) continue;
				else {
					ch = str.charAt(j);
					ans += ch;
				}
			}
			
			System.out.println(ans);
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			String ans = "";
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'e') ans += 'i';
				else if(str.charAt(i) == 'E') ans += 'I';
				else if(str.charAt(i) == 'i') ans += 'e';
				else if(str.charAt(i) == 'I') ans += 'E';
				else ans += str.charAt(i);
			}
			
			System.out.println(ans);
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			String ans = "";
			char[] ch = str.toCharArray();
			if(str.equals("END")) break;
			for (int i = ch.length - 1; i >= 0; i--) ans += ch[i];
			System.out.println(ans);
		}
	}
}
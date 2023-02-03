import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] ch = sc.next().toCharArray();
		int cnt = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			if(ch[i] == '0') ch[i] = (char)-1;
			else break;
		}
		for (int i = 0; i < ch.length; i++)
			if(ch[i] == '0') cnt++;
		
		System.out.println(cnt);
	}
}

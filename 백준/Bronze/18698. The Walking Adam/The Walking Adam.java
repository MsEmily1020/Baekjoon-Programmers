import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			char[] ch = sc.next().toCharArray();
			int cnt = 0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[j] == 'D') break;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}

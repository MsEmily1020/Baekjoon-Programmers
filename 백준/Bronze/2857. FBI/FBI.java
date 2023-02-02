import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			String fbi = sc.next();
			
			if(fbi.contains("FBI")) {
				sb.append(i + " ");
				cnt++;
			}
		}
		if(cnt == 0) System.out.println("HE GOT AWAY!");
		else System.out.println(sb);
	}
}

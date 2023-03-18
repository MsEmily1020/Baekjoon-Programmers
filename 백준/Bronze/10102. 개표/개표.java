import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); sc.nextLine();
		char[] ch = sc.nextLine().toCharArray();
		int cnt1 = 0, cnt2 = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == 'A') cnt1++;
			else cnt2++;
		}
		System.out.println(cnt1 > cnt2 ? "A" : cnt1 == cnt2 ? "Tie" : "B");
	}
}
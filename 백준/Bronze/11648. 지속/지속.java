import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.next().split("");
		int cnt = 0;
		
		while(str.length > 1) {
			int tmp = 1;
			for(int i = 0; i < str.length; i++)
				tmp *= Integer.parseInt(str[i]);
			str = Integer.toString(tmp).split("");
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
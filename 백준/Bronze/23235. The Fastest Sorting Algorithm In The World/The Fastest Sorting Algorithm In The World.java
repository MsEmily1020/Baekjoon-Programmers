import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int cnt = 1;
		while(true) {
			if(sc.nextLine().equals("0")) break;
			sb.append("Case ").append(cnt + ": ").append("Sorting... done!\n");
			cnt++;
		}
		System.out.println(sb);
	}
}
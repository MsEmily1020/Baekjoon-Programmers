import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] ans = "F,D-,D0,D+,C-,C0,C+,B-,B0,B+,A-,A0,A+".split(",");
		double[] cnt = { 0.0, 0.7, 1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 4.3 };
		for (int i = 0; i < ans.length; i++) {
			if(str.equals(ans[i])) System.out.println(cnt[i]);
		}
	}
}
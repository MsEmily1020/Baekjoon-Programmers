import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = "CU,:-),:-(,;-),:-P,(~.~),TA,CCC,CUZ,TY,YW,TTYL".split(",");
		String[] ans = "see you,I’m happy,I’m unhappy,wink,stick out my tongue,sleepy,totally awesome,Canadian Computing Competition,because,thank-you,you’re welcome,talk to you later".split(",");
		
		while(true) {
			String in = sc.next();
			for (int i = 0; i < ans.length; i++)
				if(in.equals(str[i])) { System.out.println(ans[i]); break; }
				else if(i == ans.length - 1) System.out.println(in);
			if(in.equals("TTYL")) break;
		}
	}
}
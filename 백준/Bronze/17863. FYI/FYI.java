import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		if(ch[0] == '5' && ch[1] == '5' && ch[2] == '5') System.out.println("YES");
		else System.out.println("NO");
	}
}
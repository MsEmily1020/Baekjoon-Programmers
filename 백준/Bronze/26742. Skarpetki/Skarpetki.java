import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		int w = 0, b = 0;
		for (int i = 0; i < ch.length; i++)
			if(ch[i] == 'B') w++;
			else b++;
		System.out.println(w/2 + b/2);
	}
}

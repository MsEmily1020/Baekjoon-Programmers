import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		char[] ch = sc.nextLine().toCharArray();
		String[] eight = {"000","001","010","011","100","101","110","111"};
		for (int i = 0; i < ch.length; i++)
			for (int j = 0; j < 8; j++)
				if(ch[i] - '0' == j) sb.append(eight[j]);
		if(sb.charAt(0) == '0') sb.deleteCharAt(0);
		if(sb.charAt(0) == '0') sb.deleteCharAt(0);
		System.out.println(sb);
	}
}
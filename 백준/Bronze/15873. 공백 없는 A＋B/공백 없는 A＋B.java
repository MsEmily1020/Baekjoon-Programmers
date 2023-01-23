import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		boolean isEmp = true;
		for (int i = 0; i < ch.length; i++)
			if(ch[i] == '0') { isEmp = true; break; }
			else isEmp = false;

		if(isEmp) {
			if(ch.length == 4) {
				if(ch[1] == '0' && ch[3] == '0') System.out.println(20);
			}
			else if(ch.length == 3) {
				if(ch[1] == '0') System.out.println(10 + (ch[2] - '0'));
				else if(ch[2] == '0') System.out.println((ch[0] - '0') + 10);
			}
		}
		else System.out.println((ch[0] - '0') + (ch[1] - '0'));
	}
}